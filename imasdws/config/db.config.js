'use strict';
const mysql = require('mysql');

//local bd connection
const dbConn = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '123456',
    database: 'node_mysql_crud_db'
});
dbConn.connect(function(err){
    console.log(err);
    if (err) throw err;
    console.log('database connect');
});

module.exports = dbConn;