package com.bridgelabz;

import com.bridgelabz.exceptions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidation {

    private Pattern pattern;
    private Matcher matcher;

    public boolean isFirstNameValid(String firstName) throws InvalidFirstNameException{
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (!result){
            throw new InvalidFirstNameException(InvalidInputType.INVALID_FIRST_NAME,"Invalid first name");
        }
        return result;
    }

    public boolean isLastNameValid(String lastName) throws InvalidLastNameException{
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(lastName);
        boolean result =  matcher.matches();
        if (!result){
            throw new InvalidLastNameException(InvalidInputType.INVALID_LAST_NAME,"Invalid last name");
        }
        return result;
    }

    public boolean isEmailValid(String email) throws InvalidEmailException {
        //String regex = "[^.]+[a-z0-9._+-][^.+()*#$%!@-]+@[a-z0-9]+[.][a-z]{2,3}(.[a-z]{2,})+";
        String regex = "^[^.][A-Za-z0-9.+-]+[^.]@[a-z0-9]+([.][a-z]{2,3})([.][a-z]{2,3})?$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(email);
        boolean result =  matcher.matches();
        if (!result){
            throw new InvalidEmailException(InvalidInputType.INVALID_EMAIL,"Invalid Email");
        }
        return result;
    }

    public boolean isMobileNoValid(String mobileNo) throws InvalidMobileException {
        String regex = "[0-9]{1,2}[ ][0-9]{10}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();
        if (!result){
            throw new InvalidMobileException(InvalidInputType.INVALID_MOBILE,"Invalid mobile number");
        }
        return result;
    }
    /*
    * This method used to check password is matching with regex or not
    * */
    public boolean isPasswordValid(String password) throws InvalidPasswordException{
        //String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*+=]).{8,}$";
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);
        boolean result =  matcher.matches();
        if (!result){
            throw new InvalidPasswordException(InvalidInputType.INVALID_PASSWORD,"Invalid password");
        }
        return result;
    }


}
