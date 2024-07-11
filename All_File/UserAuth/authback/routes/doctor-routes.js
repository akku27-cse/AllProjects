const express = require("express");
/*const {
  signup,
  login,
  verifyToken,
  getUser,
} = require("../controller/user-controller");
*/
const { doctorsignup } = require("../controller/doctor-controller");
const doctorrouter = express.Router();

// router.get('/', (req, res) => {
//     res.send("hello");
// })

doctorrouter.post("/doctorsignup", doctorsignup);
// doctorrouter.post("/login", login);

// doctorrouter.get("/user", verifyToken, getUser);

module.exports = doctorrouter;
