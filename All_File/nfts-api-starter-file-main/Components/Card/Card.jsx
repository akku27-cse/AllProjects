import React, { useState } from "react";
import Image from "next/image";
import Link from "next/link";
import Style from "./Card.module.css";
import image from "../Image/client/index";

const Card = ({ setNotification, image, index }) => {
  return (
    <div class={Style.card}>
      <div class={Style.content}>
        <a href={`/image/${image.imageID}`}>
          <p>
            <img
              className={Style.image}
              src={image.image}
              alt="image"
              width={250}
              height="200"
            />
          </p>
        </a>

        <span class={Style.para}>
          <Image
            className="avatar_img"
            src={image[`client${index + 1}`]}
            width={40}
            height={40}
          />
          <small
            className={Style.para_small}
            onClick={() => {
              setNotification("sucessfully copied"),
                navigator.clipboard.writeText(image.owner);
            }}
          >
            {image.owner.slice(0, 25)}...
          </small>
        </span>
        <span>
          CreateAt:{new Date(image.createAt * 1000).toDateString()}
          <small className={Style.number}>#{image.imageID}</small>
        </span>
        <small class={Style.para}>{image.description.slice(0, 80)}...</small>
        <button
          onClick={() => {
            setNotification("Image URL is SUccessfully copied"),
              navigator.clipboard.writeText(image.image);
          }}
          class={Style.btn}
        >
          copy URL
        </button>
      </div>
    </div>
  );
};

export default Card;
