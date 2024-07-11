require('dotenv').config();
const express = require('express');
const app = express();
const cors = require('cors');
const connection = require('./db');
const userRoutes = require('./routes/user');
const authRoute = require('./routes/auth');


//databse
connection();


//middlewire
app.use(express.json());
app.use(cors());


//routes
app.use("/api/user", userRoutes);
app.use("/api/auth",authRoute)

//server port 
const port = process.env.PORT || 27;
app.listen(port, () => {
    console.log(`Server Running on port ${port}........`);
})
