/*
 * Copyright (c) 2020,  Ujjwal. All rights reserved.
 * UJJWAL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


import java.util.Scanner;

public class HomePage {
    String email;
    String password;


    void loginMessage(){
        System.out.println("=====================Welcome To The Shopping Mall========================");


    }
    void loginOptions(){
        Scanner loginOption = new Scanner(System.in);

        System.out.println("1. Login\n2. Signup");
        System.out.println("Enter your Option");
        int option = loginOption.nextInt();
        switch (option){
            case 1:
                System.out.println("===================== Enter Your Details ====================== ");
                Signup signupDetails = new Signup();
                signupDetails.enterSignUpDetails();
                break;
            case 2:
                System.out.println("======================== Please register yourself ==============");
                break;
            default:
                System.out.println("=======================Please enter Some Value ==================");
                break;


        }



    }



    public static void main(String[] args) {
        HomePage homeScreen = new HomePage();
        homeScreen.loginMessage();
        homeScreen.loginOptions();










    }
}
