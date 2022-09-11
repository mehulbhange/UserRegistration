package com.bridgelabz;

import com.bridgelabz.exceptions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserRegistrationTest {

    UserInputValidation userInputValidation = new UserInputValidation();

    @Test
    public void givenValidFirstName_shouldReturnTrue(){
        try{
            boolean result = userInputValidation.isFirstNameValid("Mehul");
            Assertions.assertTrue(result);
        }catch (InvalidInputException exception){
            Assertions.assertEquals(InvalidInputType.INVALID_FIRST_NAME, exception.type);
        }

    }

    @Test
    public void givenInvalidFirstName_shouldThrowInvalidFirstNameException(){
        try{
            boolean result = userInputValidation.isFirstNameValid("mehul");
            Assertions.assertTrue(result);
        }catch (InvalidInputException exception){
            Assertions.assertEquals(InvalidInputType.INVALID_FIRST_NAME, exception.type);
        }
    }

    @Test
    public void givenValidLastName_shouldReturnTrue(){
        try{
            boolean result = userInputValidation.isLastNameValid("Mehul");
            Assertions.assertTrue(result);
        }catch (InvalidInputException exception){
            Assertions.assertEquals(InvalidInputType.INVALID_LAST_NAME, exception.type);
        }
    }

    @Test
    public void givenInvalidLastName_shouldThrowInvalidLastNameException(){
        try{
            boolean result = userInputValidation.isLastNameValid("mehul");
            Assertions.assertTrue(result);
        }catch (InvalidInputException exception){
            Assertions.assertEquals(InvalidInputType.INVALID_LAST_NAME, exception.type);
        }
    }


    @Test
    public void givenValidEmail_shouldReturnTrue(){
        try{
            boolean result = userInputValidation.isEmailValid("abc.100@yahoo.com");
            Assertions.assertTrue(result);
        }catch (InvalidInputException exception){
            Assertions.assertEquals(InvalidInputType.INVALID_EMAIL, exception.type);
        }
    }
    @Test
    public void givenInvalidEmail_shouldThrowInvalidEmailException(){
        try{
            boolean result = userInputValidation.isEmailValid("abc.@yahoo.com");
            Assertions.assertTrue(result);
        }catch (InvalidInputException exception){
            Assertions.assertEquals(InvalidInputType.INVALID_EMAIL, exception.type);
        }
    }

    @Test
    public void whenInvalidEmailExceptionThrown_thenAssertionSucceeds(){
        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> {
            userInputValidation.isEmailValid("abc.@yahoo.com");
        });
        Assertions.assertEquals(InvalidInputType.INVALID_EMAIL, exception.type);
    }


    @Test
    public void givenValidMobileNo_shouldReturnTrue(){
        try{
            boolean result = userInputValidation.isMobileNoValid("91 9090909090");
            Assertions.assertTrue(result);
        }catch (InvalidInputException exception){
            Assertions.assertEquals(InvalidInputType.INVALID_MOBILE, exception.type);
        }
    }
    @Test
    public void whenInvalidMobileExceptionThrown_thenAssertionSucceeds(){
        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> {
            userInputValidation.isMobileNoValid("00 90909090");
        });
        Assertions.assertEquals(InvalidInputType.INVALID_MOBILE, exception.type);
    }

    @Test
    public void givenValidPassword_shouldReturnTrue(){
        try{
            boolean result = userInputValidation.isPasswordValid("Abc#1234");
            Assertions.assertTrue(result);
        }catch (InvalidInputException exception){
            Assertions.assertEquals(InvalidInputType.INVALID_PASSWORD, exception.type);
        }
    }

    @Test
    public void whenInvalidPasswordExceptionThrown_thenAssertionSucceeds(){
        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> {
            userInputValidation.isPasswordValid("mehul123");
        });
        Assertions.assertEquals(InvalidInputType.INVALID_PASSWORD, exception.type);
    }

}
