import java.util.Scanner;

public class ThreeDigitUsingModulus {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        String number = scanner.nextLine();
        int digits = Integer.parseInt(number);

        int third = digits / 100;
        System.out.println("There is a " + third + " in the third digit place");

        int second =  (digits-(third*100)) / 10;
        System.out.println("There is a " + second + " in the second digit place");

        int first = (digits-(third*100)-(second*10));
        System.out.println("There is a " + first + " in the first digit place");


    }
}
