const http = require('http');

http.createServer((req, res, next) => {
    
    res.send("hello");
}).listen(8000, () => {
    console.log(`server is running on port 8000`)
})