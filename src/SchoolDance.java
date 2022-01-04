import java.util.Objects;
import java.util.Scanner;

public class SchoolDance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the dance, how old are you?");
        String number = scanner.nextLine();
        int age = Integer.parseInt(number);
        if (age > 13) {
            System.out.println("Welcome to the dance! Do You have a guest?");
            String answer = scanner.nextLine();
            if (Objects.equals(answer, "yes")) {
                if (age >= 16) {
                    System.out.println("How old is your guest?");
                    scanner.nextLine();
                    System.out.println("We welcome you and your guest");
                } else
                    System.out.println("Your guest cannot enter the dance");
            } else
                System.out.println("enjoy your time.");
        } else
            System.out.println("You cannot enter the dance");


    }


}


