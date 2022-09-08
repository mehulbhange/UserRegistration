package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    /*
    * It will run the test cases multiple times for all given inputs
    * */
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc.100@abc.com.au"})
    public void givenMultipleValidEmail_shouldReturnTrue(String email){
        Assertions.assertTrue(userInputValidation.isEmailValid(email));
    }
    /*
     * It will run the test cases multiple times for all given inputs
     * */
    @ParameterizedTest
    @ValueSource(strings = {"abc", "abc@.com.my","abc123@.com","abc123@gmail.a","abc123@.com.com"})
    public void givenMultipleInvalidEmail_shouldReturnFalse(String email){
        Assertions.assertFalse(userInputValidation.isEmailValid(email));
    }

}
