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

        System.out.println("Enter last name ");
        String lastName = sc.next();
        if (validation.isLastNameValid(lastName))
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");

        System.out.println("Enter email ");
        String email = sc.next();
        if (validation.isEmailValid(email))
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");

        System.out.println("Enter Phone number ");
        String phone = sc.nextLine();
        if (validation.isMobileNoValid(phone))
            System.out.println("Valid mobile number");
        else
            System.out.println("Invalid mobile number");


    }
}
