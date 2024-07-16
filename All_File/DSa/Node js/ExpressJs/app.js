const express = require('express');
const app = express();
const port = 3000;
app.listen(port, (req, res) => {
    console.log(`Server runs on port ${port}`);
})