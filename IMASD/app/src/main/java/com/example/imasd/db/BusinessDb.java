package com.example.imasd.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.imasd.model.Employee;

@Database(entities = {Employee.class}, version = 1)
public abstract class BusinessDb extends RoomDatabase {
    abstract public EmployeeDao employeeDao();
}
