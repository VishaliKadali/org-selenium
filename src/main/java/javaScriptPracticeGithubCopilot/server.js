const express = require('express');
const http = require('http');
const socketIo = require('socket.io');
const path = require('path');

// Set up the Express app
const app = express();
const server = http.createServer(app);
const io = socketIo(server);

// Serve the index.html file
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

// Handle socket connections
io.on('connection', (socket) => {
    console.log('A user connected', socket.id); // Log the socket ID

    // Listen for 'chat message' events
    socket.on('chat message', (msg) => {
        console.log(`Message received from ${socket.id}: ${msg}`);
        // Broadcast the message to all connected users
        io.emit('chat message', msg);
    });

    // Handle user disconnection
    socket.on('disconnect', () => {
        console.log('A user disconnected', socket.id); // Log the socket ID
    });
});

// Start the server on port 3000
server.listen(3000, () => {
    console.log('Listening on http://localhost:3000');
});
