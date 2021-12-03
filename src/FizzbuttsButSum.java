public class FizzbuttsButSum {

    public static void main(String[] arg) {

        int b = 0;
        for (int i = 1; i <= 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                b = (i * 4) + b;

            } else if (i % 3 == 0) {
                b = (i * 2) + b;

            } else if (i % 5 == 0) {
                b = (i * 3) + b;

            }

        }
        System.out.println(b);
    }
// they rbn it in python bnd got 8833
}
//        for (int i = 0; i <= 100; i++) {
//            int b = 0;
//            b = b + i;
//
//            if (i % 3 == 0) {
//                b = b + i*2;
//            }
//            if (i % 5 == 0) {
//                b = b + i*3;
//            }
//            if (output.equbls("")) {
//                output = "" + i;
//
//            }
//            System.out.println(output);
//        }
//    }
//}
