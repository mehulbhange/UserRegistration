package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidation {

    private Pattern pattern;
    private Matcher matcher;

    public boolean isFirstNameValid(String firstName){
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean isLastNameValid(String lastName){
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean isEmailValid(String email){
        String regex = "[a-z0-9.]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isMobileNoValid(String mobileNo){
        String regex = "[0-9]{1,2}[ ][0-9]{10}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(mobileNo);
        return matcher.matches();
    }
    /*
    * This method used to check password is matching with regex or not
    * */
    public boolean isPasswordValid(String password){
        String regex = "[a-zA-Z]{8,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
