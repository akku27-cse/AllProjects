const router = require('express').Router();
const Joi = require('joi');
const bcrypt = require('bcrypt');
const {  User } = require('../models/user');



router.post("/", async (req, res) => {
    try {
        const { error } = validate(req.body);
        if (error)
            return res.status(400).send({ message: error.details[0].message });
        const user = await User.findOne({ email: req.body.email });
        if (!user) return res.status(401).send({ message: "Invalid Email or password" });
        const validpassword = await bcrypt.compare(
            req.body.password,
            user.password
        );
        if (!validpassword)
            return res.status(401).send({ message: "Invalid email or password" });
        const token = user.generateAuthToken();
        res.status(200).send({ data: token, message: "LoggedIn successfull" });
    } catch (eroor) {
    res.status(500).send({ message: "server error" });
  }
});
const validate = (data) => {
  const schema = Joi.object({
    email: Joi.string().required().label("Email"),
    password: Joi.string().required().label("Password"),
  });
  return schema.validate(data);
};

module.exports = router;