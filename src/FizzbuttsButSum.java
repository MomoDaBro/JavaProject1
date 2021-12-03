public class FizzbuttsButSum {

    public static void main(String[] arg) {

        int a = 0;
        for (int i = 1; i <= 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                a = (i * 4) + a;

            } else if (i % 3 == 0) {
                a = (i * 2) + a;

            } else if (i % 5 == 0) {
                a = (i * 3) + a;

            }

        }
        System.out.println(a);
    }
// they ran it in python and got 8833
}
//        for (int i = 0; i <= 100; i++) {
//            int a = 0;
//            a = a + i;
//
//            if (i % 3 == 0) {
//                a = a + i*2;
//            }
//            if (i % 5 == 0) {
//                a = a + i*3;
//            }
//            if (output.equals("")) {
//                output = "" + i;
//
//            }
//            System.out.println(output);
//        }
//    }
//}
