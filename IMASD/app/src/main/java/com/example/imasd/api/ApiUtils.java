package com.example.imasd.api;

public class ApiUtils {

    private ApiUtils() {}

    private static final String BASE_URL = "https://venados.dacodes.mx";

        public static WebServiceApi getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(WebServiceApi.class);
    }

}