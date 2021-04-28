package com.example.imasd.api;

import androidx.lifecycle.LiveData;

import com.example.imasd.model.Employee;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface WebServiceApi {

    @Headers("Accept:application/json")
    @POST("")
    Call<Employee> saveEmployeePost(@Body Employee employee);

}
