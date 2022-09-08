package com.bridgelabz.exceptions;

public class InvalidFirstNameException extends Exception{
    public InvalidInputType type;

    public InvalidFirstNameException(InvalidInputType type, String msg){
        super(msg);
        this.type = type;
    }
}
