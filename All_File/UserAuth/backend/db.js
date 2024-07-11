const mongoose = require('mongoose');
const colors = require('colors');
module.exports = () => {
    const connectionParams = {
        useNewUrlParser: true,
        useUnifiedTopology: true,
    };
    try {
        mongoose.connect(process.env.DB, connectionParams);
        console.log(colors.bgGreen("connection Done....."),);
    } catch (error) {
        console.log(error);
    }
}