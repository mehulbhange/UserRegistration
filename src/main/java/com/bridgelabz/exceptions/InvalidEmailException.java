package com.bridgelabz.exceptions;

public class InvalidEmailException extends Exception{
    public InvalidInputType type;

    public InvalidEmailException(InvalidInputType type, String msg){
        super(msg);
        this.type = type;
    }
}
