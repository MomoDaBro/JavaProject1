import java.util.Scanner;

public class QuadraticCalculator {

    public static void main(String[] args) {
        System.out.println("Type in your a value");
        Scanner scanner = new Scanner(System.in);
        String AV = scanner.nextLine();
        int z = Integer.parseInt(AV);
        System.out.println("Type in your b value");
        String BV = scanner.nextLine();
        int ab = Integer.parseInt(BV);
        System.out.println("Type in your c value");
        String CV = scanner.nextLine();
        int ac = Integer.parseInt(CV);
        int ad = (ab * ab) - (4 * ac * z);
        if (ad > 0)
            System.out.println("It has two roots");
        if (ad == 0)
            System.out.println("It has one root");
        else
            System.out.println("It has no roots");
    }
}


