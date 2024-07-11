require("dotenv").config();
const express = require("express");
const cors = require("cors");
const mongoose = require("mongoose");
const connection = require('./db')
const colors =require('colors')
const app = express();

//databse
connection();


app.use(express.json);
app.use(express.urlencoded);
app.use(cors());

//data base

const userSchema = new mongoose.Schema({
  firstName: {
    type: String,
    required: true,
  },
  lastName: {
    type: String,
    required: true,
  },
  add: {
    type: String,
    required: true,
  },
  dob: {
    type: Date,
    default: Date.now,
    required: true,
  },
  gender: {
    type: String,
    required: true,
  },
  phone: {
    type: Number,
    required: true,
  },
  email: {
    type: String,
    required: true,
    unique: true,
  },
  password: {
    type: String,
    required: true,
  },
});

const Use = new mongoose.model("User", userSchema);

//route
app.post("/login", (req, res) => {
    res.send("My api login");
})
app.post("/register", (req, res) => {
    console.log(req.body)
})

//server port create
const port = process.env.PORT || 4000;
app.listen(port, () => {
  console.log(colors.bgMagenta(`Server Running on port ${port}........`),);
});



