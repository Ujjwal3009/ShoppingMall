import java.io.IOException;
public class CLS {
    public static void main(String... arg)throws  IOException,InterruptedException {
        System.out.println("Ujjwal");
        new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();



    }
}
