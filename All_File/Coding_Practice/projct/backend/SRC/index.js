const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose');
const colors = require('colors');


//call express
const app = express();



//use of express
app.use(express.json());
app.use(cors());//for interacting with frontend

//connect mongo
mongoose.connect()



//create server

const PORT = 8000;
app.listen(PORT, () => {
    console.log(`server run on port ${PORT}`.bgCyan);
})