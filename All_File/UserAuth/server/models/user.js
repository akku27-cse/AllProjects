const mongoose = require('mongoose');
const jwt = require('jsonwebtoken');
const joi = require('joi');
const passwordCompexity = require('joi-password-complexity');
const Joi = require('joi');
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
        default:Date.now,
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

userSchema.methods.generateAuthToken = function () {
    const token = jwt.sign({ _id: this._id }, process.env.JWTPRIVATEKEY, { expiresIn: "30d" });
    return token;
} 

const User = mongoose.model("user", userSchema);
const validate = (data) => {
    const schema = Joi.object({
      firstName: Joi.string.required().lebel("First Name"),
      lastName: Joi.string().required().label("Last Name"),
      add: Joi.string().required().label("Address"),
      dob: Joi.date().required().label("Date of Birth"),
      gender: Joi.string().required().label("Gender"),
      phone: Joi.number().required().label("phone"),
      email: Joi.string().required().label("Email"),
      password:passwordCompexity().required().label("Password")
    });
    return schema.validate(data);
}
module.exports = { User,validate };