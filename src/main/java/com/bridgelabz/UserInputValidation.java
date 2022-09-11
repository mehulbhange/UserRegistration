package com.bridgelabz;

import com.bridgelabz.exceptions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidation {

    private Pattern pattern;
    private Pattern firstNamePattern = Pattern.compile("[A-Z][a-z]{2,}");
    private Pattern lastNamePattern = Pattern.compile("[A-Z][a-z]{2,}");
    private Pattern emailPattern = Pattern.compile("^[^.][A-Za-z0-9.+-]+[^.]@[a-z0-9]+([.][a-z]{2,3})([.][a-z]{2,3})?$");
    private Pattern mobileNoPattern = Pattern.compile("[0-9]{1,2}[ ][0-9]{10}");
    private Pattern passwordPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$");

    public boolean isFirstNameValid(String firstName) throws InvalidInputException{
        CheckPattern firstNameCheck = (regexPattern,input) -> {
            boolean result =  regexPattern.matcher(input).matches();
            if (!result)
                throw new InvalidInputException(InvalidInputType.INVALID_FIRST_NAME,"Invalid first name");
            return result;
        };
        return firstNameCheck.isValid(firstNamePattern, firstName);
    }
    public boolean isLastNameValid(String lastName) throws InvalidInputException{
        CheckPattern lastNameCheck = (regexPattern, input) -> {
            boolean result = regexPattern.matcher(input).matches();
            if (!result) {
                throw new InvalidInputException(InvalidInputType.INVALID_LAST_NAME, "Invalid last name");
            }
            return result;
        };
        return lastNameCheck.isValid(lastNamePattern, lastName);
    }
    public boolean isEmailValid(String email) throws InvalidInputException {
        CheckPattern emailCheck = (regexPattern, input) -> {
            boolean result = regexPattern.matcher(input).matches();
            if (!result) {
                throw new InvalidInputException(InvalidInputType.INVALID_EMAIL, "Invalid Email");
            }
            return result;
        };
        return emailCheck.isValid(emailPattern, email);
    }
    public boolean isMobileNoValid(String mobileNo) throws InvalidInputException {
        CheckPattern mobileCheck = (regexPattern, input) ->{
            boolean result = regexPattern.matcher(input).matches();
            if (!result){
                throw new InvalidInputException(InvalidInputType.INVALID_MOBILE,"Invalid mobile number");
            }
            return result;
        };
        return mobileCheck.isValid(mobileNoPattern,mobileNo);
    }
    public boolean isPasswordValid(String password) throws InvalidInputException{
        CheckPattern passwordCheck = (regexPattern, input) -> {
            boolean result = regexPattern.matcher(input).matches();
            if (!result) {
                throw new InvalidInputException(InvalidInputType.INVALID_PASSWORD, "Invalid password");
            }
            return result;
        };
        return passwordCheck.isValid(passwordPattern, password);
    }

}
