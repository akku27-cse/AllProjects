const socket = io();
let name;
let textarea = document.querySelector("#textarea");
do {
  name = prompt("Please Enter Your Name:");
} while (!name);

textarea.addEventListener("keyup", (e) => {
  if (e.key === "Enter") {
    sendMessage(e.target.value);
  }
});

function sendMessage(message) {
  let msg = {
    user: name,
    message: message.trim(),
  };

  //msg append
  appendMessahe(msg, "outgoing");
  textarea.value = "";
  scrollToButtom();
  socket.emit("message", msg);
}
let messagearea = document.querySelector(".Message_area");
function appendMessahe(msg, type) {
  let mainDiv = document.createElement("div");
  let className = type;
  mainDiv.classList.add(className, "message");
  let markup = `
    <h4>${msg.user}</h4>
    <p>${msg.message}</p>
    `;
  mainDiv.innerHTML = markup;
  messagearea.appendChild(mainDiv);
}
socket.on("message", (msg) => {
  appendMessahe(msg, "incoming");
  scrollToButtom();
});
function scrollToButtom() {
  messagearea.scrollTop = messagearea.scrollHeight;
}
