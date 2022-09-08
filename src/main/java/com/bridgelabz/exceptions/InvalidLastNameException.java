package com.bridgelabz.exceptions;

public class InvalidLastNameException extends Exception{
    public InvalidInputType type;

    public InvalidLastNameException(InvalidInputType type, String msg){
        super(msg);
        this.type = type;
    }
}
