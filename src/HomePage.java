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


import java.time.LocalDate;
import java.util.Scanner;
/**
 * HomePage class for Showing Homepage to user
 */

public class HomePage {

    String email;
    String password;
    static{
        System.out.println("=====================Welcome To The Shopping Mall========================");
    }


    /**
     * LoginOptions is the method od HomePage Class to show the options of
     * Signup and login to user.
     */
    void loginOptions(){

        Scanner loginOption = new Scanner(System.in);

        System.out.println("1. Login\n2. Signup");
        System.out.println("Enter your Option");
        int option = loginOption.nextInt();
        switch (option){
            case 1:
                System.out.println("===================== Enter Your Details ====================== ");
                LogIn logindetails = new LogIn();
                logindetails.loginDetailEnter();

                break;
            case 2:
                System.out.println("======================== Please register yourself ==============");
                Signup signupDetails = new Signup();
                signupDetails.enterSignUpDetails();

                break;
            default:
                System.out.println("=======================Please enter Some Value ==================");
                break;


        }



    }



    public static void main(String[] args) {
        HomePage homeScreen = new HomePage();
//        homeScreen.loginMessage();
        homeScreen.loginOptions();










    }
}
