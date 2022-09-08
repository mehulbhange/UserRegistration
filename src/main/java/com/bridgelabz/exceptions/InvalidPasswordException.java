package com.bridgelabz.exceptions;

public class InvalidPasswordException extends Exception{
    public InvalidInputType type;
    public InvalidPasswordException(InvalidInputType type, String msg){
        super(msg);
        this.type = type;
    }
}
