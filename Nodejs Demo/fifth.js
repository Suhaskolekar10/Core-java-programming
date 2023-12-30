var http = require('http')

http.createServer(function(req, res){
    res.write("Welcome to node js..")
    res.end()
}).listen(8001)