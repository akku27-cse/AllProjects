const mongoose = require("mongoose");
const Schema = mongoose.Schema;
const userSchema = new Schema({
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
  age: {
    type: String,
    //default: Date.now,
    required: true,
  },
   doctorid: {
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
    minlength: 8,
  },
});

module.exports = mongoose.model("Doctor", userSchema);
