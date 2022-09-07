package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserInputValidation userInputValidation = new UserInputValidation();

    @Test
    public void givenValidFirstName_shouldReturnTrue(){
        boolean result = userInputValidation.isFirstNameValid("Mehul");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenInvalidFirstName_shouldReturnFalse(){
        boolean result = userInputValidation.isFirstNameValid("mehul");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenValidLastName_shouldReturnTrue(){
        boolean result = userInputValidation.isLastNameValid("Mehul");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenInvalidLastName_shouldReturnFalse(){
        boolean result = userInputValidation.isLastNameValid("mehul");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenValidEmail_shouldReturnTrue(){
        boolean result = userInputValidation.isEmailValid("abc.100@yahoo.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenInvalidEmail_shouldReturnFalse(){
        boolean result = userInputValidation.isEmailValid("abc123@.com.com");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenValidMobileNo_shouldReturnTrue(){
        boolean result = userInputValidation.isMobileNoValid("91 9090909090");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenInvalidMobileNo_shouldReturnFalse(){
        boolean result = userInputValidation.isMobileNoValid("91909090");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenValidPassword_shouldReturnTrue(){
        boolean result = userInputValidation.isPasswordValid("Abc#1234");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenInvalidPassword_shouldReturnFalse(){
        boolean result = userInputValidation.isMobileNoValid("abc45");
        Assertions.assertFalse(result);
    }
}
