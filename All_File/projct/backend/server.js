const dotenv = require("dotenv");
const express = require("express");
const colors = require("colors");
const cors = require("cors");
const connectDb = require("./config/db");

const userRouter=require('./routes/user.js')


//

//call dotenv file
dotenv.config();
//mongodb
connectDb();

//rest object
const app = express();
//middleware
app.use(cors());
app.use(express.json());
//authentaction

app.use("/", userRouter);

//listen
const port = process.env.PORT;
app.listen(port, (req, res) => {
  console.log(`Server Running on Port ${port}`.bgMagenta);
});
