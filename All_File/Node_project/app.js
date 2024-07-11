
require('dotenv').config();
const express = require('express');
const expressEjsLayouts = require('express-ejs-layouts');
const app = express();


//connect with html css js
app.use(express.static('public'));

//tamplate Engine
app.use(expressEjsLayouts);
app.use('layout', './layouts/main');
app.set('view engine', 'ajs');



app.use('/',require('./server/routes/main.js'))


const port=127
app.listen(port, () => {
    console.log(`server Running on port ${port}`)
})