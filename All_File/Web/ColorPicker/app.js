const colorPicker = document.querySelector("#color-picker");

const activateEyeDropper = async () => {
  try {
    const eyeDropper = new EyeDropper;
    const response = await eyeDropper.open();
    console.log(response);
  } catch (error) {
    console.log(error);
  }
};
colorPicker.addEventListener("click",activateEyeDropper);