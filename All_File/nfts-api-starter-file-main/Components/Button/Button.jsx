import React from "react";
import Style from "./Button.module.css";



const Button = ({disconnect, connect, address,file}) => {
  return (
    <>
      {address ? (
        <button onClick={() => disconnect()} class={Style.button}>
          
          <span class={Style.button_content}>{" "}
          {file ? "upload":"disconnected"}{" "}
          </span>
        </button>

      ) : (
          <button onClick={() => connect()} class={Style.button}>
            
            <span class={Style.button_content}>Connect</span>
          </button>
      )}
    
    
    
    </>


  )
};

export default Button;
