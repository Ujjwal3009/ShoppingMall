import java.util.Scanner;

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
public class LogIn {
    /**
     * This  is the method of LogIn class
     * It is used to enter the login details and confirm the user detail is correct or not
     * If details is correct  user id  directed to Welcome main page where he can do Shopping
     */
    void loginDetailEnter(){




        Scanner loginemail = new Scanner(System.in);
        System.out.println("Please Enter you registered Email : ");
        String email = loginemail.nextLine();
        System.out.println("Enter The Password");
        String password = loginemail.nextLine();
        if(email.equals("Ujjwal") && password.equals("Ujjwal3009@")){

           System.out.println("=============Welcome " + email + "=========================");
           ShopMainPage redirectAfterlogin = new ShopMainPage();
           redirectAfterlogin.shoppingOptions();
       }
        else {
            System.out.println("Wrong Credentials");
            HomePage loginoption = new HomePage();
            loginoption.loginOptions();
        }







    }
}
