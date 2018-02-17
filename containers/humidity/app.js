var express = require('express');
var app = express();

app.get('/api/humidity', function (req, res) {
  res.send({value: 55});
});

app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});


