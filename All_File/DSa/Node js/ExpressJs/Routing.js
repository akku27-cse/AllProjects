const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send('hello world');

})
const port = 2000;
app.listen(port, (req, res) => {
    console.log(`server runin...${port}`);
})