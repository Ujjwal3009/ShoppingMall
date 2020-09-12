import java.util.Scanner;

public class Signup {
    String email;
    String createpwd;
    String confmpwd;

    /**
     * SignUpDetails  is a method used for taking user details as an input.
     */

    String enterSignUpDetails()
    {
         Scanner enterdetails = new Scanner(System.in);
         System.out.println("Your email id : ");
         email = enterdetails.nextLine();
         System.out.println("Create A password for you : ");
         createpwd = enterdetails.nextLine();
         System.out.println("Confirm password");

         confmpwd = enterdetails.nextLine();

         if(confmpwd.equals(createpwd))
         {
             System.out.println("==========Please Confirm your Details=============");
             System.out.println(email + "\n" + createpwd + "\n"+ confmpwd);
             confirm();
         }
         else
             {
             System.out.println("Password Mismatch \n Please Re Enter the Details ");
             enterSignUpDetails();
         }
         return (email + createpwd );
    }
    /**
     * This is the confirm method to assure the details  filled by user is correct.
     */
    void confirm()
    {
        System.out.println("================= Do you Want to edit or Confirm the Details  ================= \n 1. Confirm \n 2. Edit");
        Scanner confirmAsk = new Scanner(System.in);
        int ask = confirmAsk.nextInt();
        switch (ask)
        {
            case 1:
                System.out.println("Thank you for registering yourself");
                break;
            case 2:
                System.out.println("Please Edit your Details");
                enterSignUpDetails();
        }
    }


}
