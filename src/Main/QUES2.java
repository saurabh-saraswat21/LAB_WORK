package Main;
import java.util.Scanner;

public class QUES2 {
    public static void main(String[] args) {
        double money;
        double paise = 0.0;
        int rupee;
        Scanner k = new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT OF MONEY");
        money = k.nextDouble();
        rupee = (int) money;
        paise = 100 * (money - rupee);
        System.out.println("You have "+rupee + " Rupees and " + (int) paise + " Paise");


    }
}
