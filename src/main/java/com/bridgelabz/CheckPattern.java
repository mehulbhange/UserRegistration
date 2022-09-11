package com.bridgelabz;

import com.bridgelabz.exceptions.InvalidInputException;

import java.util.regex.Pattern;

public interface CheckPattern {
    boolean isValid(Pattern regexPattern, String value) throws InvalidInputException;
}
