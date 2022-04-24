import java.util.Scanner;
import java.lang.Math;

public class JavaCalculator {

    public static void main(String[] args) {
        calculator();
    }
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a value for the first side of a triangle.");
        String side1 = scanner.nextLine();
        System.out.println("Give me a value for the second side of a triangle.");
        String side2 = scanner.nextLine();
        int a = Integer.parseInt(side1);
        int b = Integer.parseInt(side2);
        a = a*a;
        b = b*b;
        int c = a+b;
        c = (int) Math.sqrt(c);
        System.out.println(c);

    }


}
