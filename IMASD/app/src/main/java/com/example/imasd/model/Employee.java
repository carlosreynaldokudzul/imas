package com.example.imasd.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;

import com.google.gson.annotations.SerializedName;

@Entity(primaryKeys = "id")
public class Employee {
    @SerializedName("id")
    @NonNull
    private final String id;

    @SerializedName("workArea")
    private final String workArea;
    @SerializedName("name")
    private final String name;

    @SerializedName("lastName")
    private final String lastName;
    @SerializedName("motherLastName")
    private final String motherLastName;
    @SerializedName("phoneNumber")
    private final String phoneNumber;

    @SerializedName("dateOfBirth")
    private final String dateOfBirth;

    public Employee(@NonNull String id, String workArea, String name, String lastName, String motherLastName, String phoneNumber, String dateOfBirth) {
        this.id = id;
        this.workArea = workArea;
        this.name = name;
        this.lastName = lastName;
        this.motherLastName = motherLastName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getWorkArea() {
        return workArea;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
