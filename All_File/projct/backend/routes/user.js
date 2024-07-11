import UserModel from '../models/User';

const express = require('express');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcrypt');


const router = express.Router();

router.post('/register', async (req,res) => {
    const { username, password } = req.body;

    const user = await UserModel.findOne({ username });
    res.json(user);

})














export { router as userRouter };