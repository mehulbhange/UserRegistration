package com.bridgelabz.exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputType type;
    public InvalidInputException(InvalidInputType type, String msg){
        super(msg);
        this.type = type;
    }
}
