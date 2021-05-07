'use strict';

var dbConn = require('../../config/db.config');


//Employee object create
var Employee = function(employee){
    this.nombre = employee.nombre;
    this.apPaterno = employee.apPaterno;
    this.apMaterno = employee.apMaterno;
    this.telefono = employee.telefono;
    this.fechaNacimiento = employee.fechaNacimiento;
    this.area = employee.area;
    this.created_at = new Date();
    this.updated_at = new Date();
};

Employee.create = function(newEmp, result){
    dbConn.query("INSERT INTO employees SET ? ", newEmp, function(err,res){
        if(err){
            console.log('error', err);
            result(err, null);
        }else{
            console.log(res.insertId);
            result(null, res.insertId);
        }
    });
};

Employee.findById = function (id, result) {
    dbConn.query("SELECT * FROM employees WHERE id = ?", id, function(err, res){
        if(err){
            console.log('error', err)
        }else {
            result(null, res);
        }

    });
};

Employee.findAll = function(result){
    dbConn.query("SELECT * FROM employees", function(err, res){
        if(err){
            console.log("error", err);
        }else{
            result(null, res);
        }
    });
}

Employee.update = function(id, employee, result){
    dbConn.update(
    "UPDATE employees SET"+ 
    "nombre = ?, "+
    "apPaterno = ?,"+
    "apMaterno=?," +
    "telefono=?,"+
    "fechaNacimiento=?,"+
    "area=?,"+
    "WHERE id =?", 
    [employee.nombre,
    employee.apPaterno,
    employee.apMaterno,
    employee.telefono,
    employee.fechaNacimiento,
    employee.area,
    id], function(err, res){
        if (err) {
            console.log("error: ", err);
            result(null, err);
        } else {
            result(null, res);
        }
    });
};
Employee.delete = function(id, result){
    dbConn.query("DELETE FROM employees WHERE id = ?", [id],function(err, res){
        if(err){
            console.log("error:", err);
            result(null, err);
        }else{
            result(null, res);
        }
    });
};
module.exports = Employee;