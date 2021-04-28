package com.example.imasd.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.imasd.model.Employee;

import java.util.List;

@Dao
public interface EmployeeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Employee employee);

    @Query("SELECT * FROM employee WHERE id= :id")
    LiveData<Employee> findById(String id);

    @Query("SELECT * FROM employee WHERE name LIKE :name")
    LiveData<List<Employee>> findByName(String name);
}
