import "../styles/globals.css";
import { ChainId, ThirdwebProvider } from "@thirdweb-dev/react";
import { StateContextProvider } from "../Context/NFTs";

export default function App({ Component, pageProps }) {
  return (
    <ThirdwebProvider activeChain={ChainId.Mainnet}>
      <StateContextProvider>
        <Component {...pageProps} />
      </StateContextProvider>
    </ThirdwebProvider>
  );
}
