const express = require('express'); 
const { Socket } = require('socket.io');

const app = express();
//use create server Methos
const http = require('http').createServer(app);



const Port = 8000


http.listen(Port, () => {
    console.log(`server running on port ${Port}`)
})


app.use(express.static(__dirname+'/public'))
//route
app.get('/', (req, res) => {
    
res.sendFile(__dirname+ '/index.html')

})

//socket
const io = require('socket.io')(http);
io.on('connection', (socket) => {
    console.log('connected')
    socket.on('message', (msg) => {
        socket.broadcast.emit('message',msg)
    })
})
