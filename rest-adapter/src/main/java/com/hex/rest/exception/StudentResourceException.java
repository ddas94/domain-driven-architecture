package com.hex.rest.exception;

public class StudentResourceException extends RuntimeException{

    public StudentResourceException(String message){super(message);}

    public StudentResourceException(String message,Throwable throwable){super(message,throwable);}
}
