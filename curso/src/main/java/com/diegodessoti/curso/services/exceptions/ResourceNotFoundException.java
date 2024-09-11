package com.diegodessoti.curso.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public  ResourceNotFoundException(Object id){
        super("Resource not found " + id);
    }
}