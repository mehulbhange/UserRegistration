package com.bridgelabz.exceptions;

public class InvalidMobileException extends Exception{
    public InvalidInputType type;
    public InvalidMobileException(InvalidInputType type, String msg){
        super(msg);
        this.type = type;
    }
}
