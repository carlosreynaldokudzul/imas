package com.example.imasd.repository;

public class Resource<T> {

    public final Status status;

    public final String message;

    public final T data;

    public Resource(Status status, T data, String message){
        this.status = status;
        this.data = data;
        this.message = message;
    }

    /**
     * Manejador de estado para casos exitosos
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Resource<T> success(T data){
        return new Resource<>(Status.SUCCESS, data, null);
    }

    /**
     * Manejador de estado para casos de error
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Resource<T> error(String msg, T data){
        return new Resource<>(Status.ERROR, data, msg);
    }

    /**
     * Manejador de estado para casos de carga
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Resource<T> loading(T data){
        return new Resource<>(Status.LOADING, data, null);
    }
}
