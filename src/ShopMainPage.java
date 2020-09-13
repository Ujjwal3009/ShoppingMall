import java.util.Scanner;

public class ShopMainPage {
    static {
        System.out.println("What do you want to Shop ?\n 1. Mobile & SmartPhones \n 2. Accesories");

    }
    void shoppingOptions(){

        Scanner shopingOptionUser = new Scanner(System.in);
        int userchoose = shopingOptionUser.nextInt();
        switch(userchoose){
            case 1:
                System.out.println("Name            Price         Specification");
                System.out.println("1.Redmi6A       INR 5000       5MP front camera");
                System.out.println("2.Redmi5A       INR 6000       8MP front camera");
                System.out.println("3.Samsung J7    INR 18000      15MP front camera");
                System.out.println("4.IPhone11      INR 100000     25MP front camera");
                whtToShop();

                break;
            case 2:
                System.out.println("Name            Price         Specification");
                System.out.println("1.Hedphone       INR 500      Dual Bass");
                System.out.println("2.Earphone       INR 500      Dual Bass");
                System.out.println("3.Charger        INR 200      C type");
                whtToShop();


                break;
            default:
                System.out.println("Please enter a option");
                break;


        }

    }
    void whtToShop(){
        Scanner whtIShop = new Scanner(System.in);
        System.out.println("Please Choose a Product");
        int options = whtIShop.nextInt();
        Payments p = new Payments();
        p.paymentMethod();

    }


}
