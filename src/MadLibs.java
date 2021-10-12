import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name!");

        String name= scanner.nextLine();
        System.out.println("Please type in a holiday");
        String holiday = scanner.nextLine();
        System.out.println("Please type in a noun");
        String noun = scanner.nextLine();
        System.out.println("Please type in a place");
        String place = scanner.nextLine();
        System.out.println("Please type in an adjective");
        String adjective = scanner.nextLine();
        System.out.println("Please type a plural body part");
        String body = scanner.nextLine();
        System.out.println("Please type in a verb");
        String verb = scanner.nextLine();
        System.out.println("Please type in another adjective");
        String adjective2 = scanner.nextLine();
        System.out.println("Please type in another noun");
        String noun2 = scanner.nextLine();
        System.out.println("Please type in a food");
        String food = scanner.nextLine();
        System.out.println("Please type in a plural noun");
        String noun3 = scanner.nextLine();

        System.out.println("loading");
        System.out.println("I can't believe its already " + holiday + "!");
        System.out.println("I can't wait to put on my " + noun + " costume and visit every " + place + " in my neighborhood.");
        System.out.println("This year, I am going to dress up as " + name + " with " + adjective + " " + body + ".");
        System.out.println("Before I " + verb + ", I make sure to grab my " + adjective2 + " " + noun2 +  " to hold all of my " + food + ".");
        System.out.println("Finally, all of my " + noun3 + " are ready to go!");

    }
}
