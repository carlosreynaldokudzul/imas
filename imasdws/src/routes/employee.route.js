const express = require('express');

const route = express.Router();
const employeeController = require('../controllers/employee.controller');

//retrieve all employee
route.get('/', employeeController.findAll);

// create a new employee
route.post('/registerEmployee', employeeController.create);

// Retrieve a single employee with id
route.get('/:id',employeeController.update);

// Update a employee with id
route.put('/:id', employeeController.update);
// Delete a employee with id
route.delete('/:id', employeeController.delete);

module.exports = route;