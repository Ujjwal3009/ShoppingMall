import java.util.Scanner;

public class Payments {
    void paymentMethod(){
        System.out.println("Please Chhose a Mode of Payment");
        System.out.println("1.Credit Card \n 2.CoD");
        Scanner paymentUser = new Scanner(System.in);
        int chosedMethod = paymentUser.nextInt();
        switch(chosedMethod){
            case 1:
                System.out.println("Please enter the card details.");
                System.out.println("Card Number");
                long cardNumber = paymentUser.nextLong();



                System.out.println("CVV");
                int cvv = paymentUser.nextInt();
                System.out.println("Card Expiry Year");
                int year = paymentUser.nextInt();
                getAdrress();

                break;
            case 2:
                getAdrress();

                break;



        }

    }
    void getAdrress(){
        System.out.println("Please Enter the Address");
        Scanner x = new Scanner(System.in);
        x.nextLine();
        System.out.println("Thank you for Purchasing our Product! Product will Delivered in 2 days");
    }
}
