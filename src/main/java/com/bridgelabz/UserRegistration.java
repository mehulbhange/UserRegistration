package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("User registration problem");
        Scanner sc = new Scanner(System.in);
        UserInputValidation validation = new UserInputValidation();

        System.out.println("Enter first name ");
        String firstName = sc.next();
        if (validation.isFirstNameValid(firstName))
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");



    }
}
