import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        // declaration of variables
        double sum = 0.0;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER UPTO WHICH YOU WANT TO CALCULATE THE SUM :- ") ;
        n = scan.nextInt();
        for (int i = 1; i <= n ; i++) {
            sum = sum + (1.0/i);
        }
        System.out.println("THE SUM OF THE SERIES UPTO " + n + "TERMS IS "+sum );

    }
}
