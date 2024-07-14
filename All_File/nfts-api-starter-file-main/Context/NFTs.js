import React, { useState, useEffect, useContext, createContext } from "react";
import axios from "axios";
import { ethers } from "ethers";
import {
  useSigner,
  useAddress,
  useContract,
  useMetamask,
  useDisconnect,
} from "@thirdweb-dev/react";

const StateContext = createContext();

export const StateContextProvider = ({ children }) => {
  const { contract } = useContract(
    "0x268a3DE64DD492F98886C74C7Acf4d773eFc51F1"
  );
  const address = useAddress();
  const connect = useMetamask();

  const disconnect = useDisconnect();
  const signer = useSigner();
  const [userBlance, setUserBlance] = useState();
  const [loading, setloading] = useState(false);

  const fetchData = async () => {
    try {
      const balance = await signer?.getBalance();
      const userBlance = address
        ? ethers.utils.formatEther(balance?.toString())
        : "";
      setUserBlance(userBlance);
    } catch (error) {
      console.log("Error in setUser balence: ", error);
    }
  };
  useEffect(() => {
    fetchData();
  }, []);

  const UploadImage = async (imageInfo) => {
    const { title, description, email, category, image } = imageInfo;
    try {
      const listingPrice = await contract.call("listingPrice");
      const createNFTs = await contract.call(
        "uploadIPFS",
        [address, image, title, description, email, category],
        {
          value: listingPrice.toString(),
        }
      );
      const response = await axios({
        method: "POSST",
        url: `/api/v1/NFTs`,
        data: {
          titel: title,
          description: description,
          category: category,
          image: image,
          address: address,
          email: email,
        },
      });
      console.log("UploadImage API response: ", response);
      console.info("contract call success", createNFTs);
      setloading(false);
      window.location.reload();
    } catch (err) {
      console.log("Contract call failior: ", err);
    }
  };

  const getUploadedImages = async () => {
    const images = await contract.call("getAllNFTs");
    const totalUploaded = await contract.call("imgesCount");
    const listinigPrices = await contract.call("listinigPrices");
    const allImages = images.map((image, i) => ({
      owner: images.creator,
      title: images.title,
      description: images.description,
      email: images.email,
      category: images.category,
      fundraised: images.fundraised,
      image: images.image,
      imageID: images.id.toNumber(),
      createdAt: images.timestamp.toNumber(),
      listedAmount: ethers.utils.formatEther(listinigPrices.toString()),
      totalUpload: totalUploaded.toNumber(),
    }));
    return allImages;
  };

  const singleImage = async (id) => {
    try {
      const data = await contract.call("getImage", [id]);

      const image = {
        titel: data[0],
        description: data[1],
        email: data[2],
        category: data[3],
        fundraised: ethers.formatEther(data[4].toString()),
        creator: data[5],
        imageURL: data[6],
        createdAt: data[7].toNumber(),
        imageId: data[8].toNumber(),
      };
      return image;
    } catch (error) {
      console.log("Error in fetch single image: ", error);
    }
  };

  const donateFund = async ({ amount, Id }) => {
    try {
      console.log("ammount: ", amount, id);
      const transaction = await contract.call("donateToImage", [id], {
        value: amount.toString(),
      });
      console.log("Transection : ", transaction);
      window.location.reload();
    } catch (error) {
      console.log("Error in DonateFund: ", error);
    }
  };

  const getAllNFTsAPI = async () => {
    const response = await axios({
      method: "GET",
      url: "/api/v1/NFTs",
    });
    console.log("get all NFTs API : ", response);
  };

  const getSinglAllNFTsAPI = async (id) => {
    const response = await axios({
      method: "GET",
      url: `/api/v1/NFTs${id}`,
    });
    console.log("get single NFTs API : ", response);
  };

  return (
    <StateContext.Provider
      value={{
        address,
        contract,
        connect,
        disconnect,
        userBlance,
        setloading,
        loading,
        UploadImage,
        getUploadedImages,
        donateFund,
        singleImage,
        getAllNFTsAPI,
        getSinglAllNFTsAPI,
      }}
    >
      {children}
    </StateContext.Provider>
  );
};

export const useStateContext = () => useContext(StateContext);
