import java.util.Objects;
import java.util.Scanner;


public class ProgramstoDoLotsOfMathStuff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Choose between the following functions.");
            System.out.println("Program 1. Convert Degree to Radian");
            System.out.println("Program 2. Convert Radian to Degree");
            System.out.println("Program 3. Calculate surface volume and area of cylinder");
            System.out.println("Program 4. Calculate surface volume and area of sphere");
            System.out.println("Program 5. Calculate area of trapezoid");
            System.out.println("Program 6. Calculate area of parallelogram");
            System.out.println("Program 7. Calculate the arc length of an angle");
            System.out.println("Program 8. Calculate area of a sector");
            System.out.println("Program 9. Calculate the discriminate value");


            String Program = scanner.nextLine();
            int i = Integer.parseInt(Program);
            if (i == 1) {
                System.out.println("Performing Degree to Radian");
                System.out.println("Type in your Degree");
                String Radian = scanner.nextLine();
                int a = Integer.parseInt(Radian);
                int b = (int) (a * (3.141592653589793 / 180));
                System.out.println("Here is your Radian " + b + " Rad");
            } else if (i == 2) {
                System.out.println("Performing Radian to Degree");
                System.out.println("Type in your Radian");
                String Degree = scanner.nextLine();
                int c = Integer.parseInt(Degree);
                int d = (int) (c * (180 / 3.141592653589793));
                System.out.println("Here is your Degree " + d + "°");
            } else if (i == 3) {
                System.out.println("Performing Surface volume and area of cylinder");
                System.out.println("Type in your Radius");
                String Radius = scanner.nextLine();
                int e = Integer.parseInt(Radius);
                System.out.println("Type in your Height");
                String Height = scanner.nextLine();
                int f = Integer.parseInt(Height);
                int g = (int) (3.141592653589793 * (e * e) * f);
                int h = (int) ((2 * 3.141592653589793 * e * f) + (2 * 3.141592653589793 * (e * e)));
                System.out.println("The surface area is " + h + " And your surface volume is " + g);
            } else if (i == 4) {
                System.out.println("Performing Surface volume and area of sphere");
                System.out.println("Type in your Radius");
                String Radius2 = scanner.nextLine();
                int j = Integer.parseInt(Radius2);
                int k = (int) ((4 / 3) * ((3.141592653589793) * (j * j * j)));
                int l = (int) (4 * (3.141592653589793) * (j * j));
                System.out.println("The surface area is " + l + " And your surface volume is " + k);
            } else if (i == 5) {
                System.out.println("Performing area of Trapezoid");
                System.out.println("Type in your first base");
                String base = scanner.nextLine();
                int m = Integer.parseInt(base);
                System.out.println("Type in your second base");
                String base2 = scanner.nextLine();
                int n = Integer.parseInt(base2);
                System.out.println("Type in your height");
                String height2 = scanner.nextLine();
                int o = Integer.parseInt(height2);
                int p = ((m + n) / 2) * o;
                System.out.println("The area is " + p);
            } else if (i == 6) {
                System.out.println("Performing area of Parallelogram");
                System.out.println("Type in your base");
                String base3 = scanner.nextLine();
                int q = Integer.parseInt(base3);
                System.out.println("Type in your height");
                String height3 = scanner.nextLine();
                int r = Integer.parseInt(height3);
                int s = (q * r);
                System.out.println("The area is " + s);
            } else if (i == 7) {
                System.out.println("Performing Arc length");
                System.out.println("Type in your radius");
                String radius3 = scanner.nextLine();
                int t = Integer.parseInt(radius3);
                System.out.println("Type in your Degree");
                String Degree2 = scanner.nextLine();
                int u = Integer.parseInt(Degree2);
                int v = (int) (u * (3.141592653589793 / 180) * t);
                System.out.println("The length is " + v);
            } else if (i == 8) {
                System.out.println("Performing Area of sector");
                System.out.println("Type in your radius");
                String radius4 = scanner.nextLine();
                int w = Integer.parseInt(radius4);
                System.out.println("Type in your Central Angle");
                String CA = scanner.nextLine();
                int x = Integer.parseInt(CA);
                int y = (w * w) * (x / 2);
                System.out.println("The area is " + y);
            } else if (i == 9) {
                System.out.println("Performing discriminate Value");
                System.out.println("Type in your a value");
                String AV = scanner.nextLine();
                int z = Integer.parseInt(AV);
                System.out.println("Type in your b value");
                String BV = scanner.nextLine();
                int ab = Integer.parseInt(BV);
                System.out.println("Type in your c value");
                String CV = scanner.nextLine();
                int ac = Integer.parseInt(CV);
                int ad =  (ab * ab) -  (4 * ac * z);
                System.out.println("The discriminate value is " + ad);
            }
            System.out.println("Do you want to continue?");
            String answer = scanner.nextLine();
            if (Objects.equals(answer, "no"))
                break;


        }

    }
}
