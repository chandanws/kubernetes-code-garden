var express = require('express');
var app = express();

app.get('/api/temperature', function (req, res) {
  res.send({value: 23});
});

app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});


