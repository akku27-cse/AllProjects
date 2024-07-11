const mongoose = require('mongoose');
module.exports = () => {
    const connectionParams = {
        useNewUrlParser: true,
        useUnifiedTopology: true,
    };
    try {
        mongoose.connect(process.env.DB, connectionParams);
        console.log("connection Done.....");
    } catch (error) {
        console.log(error);
    }
}