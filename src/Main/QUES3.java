import java.util.Scanner;

public class QUES3 {
    public static void main(String[] args) {
        double fahrenheit;
        double celcius;
        Scanner k = new Scanner(System.in);
        fahrenheit = k.nextDouble();
        celcius = (fahrenheit-32)/1.8;
        System.out.println(fahrenheit+"TEMP IS EQUIVALENT TO");
        System.out.printf("%5.6f%n",celcius);
    }
}