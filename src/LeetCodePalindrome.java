public class LeetCodePalindrome {

    public static void isPalindrome(int x) {

        x = 121;

        int third = x / 100;
        System.out.println("There is a " + third + " in the third digit place");

        int second =  (x-(third*100)) / 10;
        System.out.println("There is a " + second + " in the second digit place");

        int first = (x-(third*100)-(second*10));
        System.out.println("There is a " + first + " in the first digit place");

        System.out.println(third);
        System.out.println(second);
        System.out.println(first);

//        int reverse =
//        if(x = reverse)
//            System.out.println("true");
    }
}
