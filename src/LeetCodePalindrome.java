public class LeetCodePalindrome {

    public static boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        if (x < 0)
            return false;
        String abc = "";
        for (int i = y.length() - 1; i >= 0; i--) {
            char a = y.charAt(i);
            abc = abc + a;
        }
//        if (abc.equals(y) == true)
//            return true;

        return abc.equals(y);
    }
// this is shehabs built diff argument
//    public static boolean isPalindrome(int x) {
//        return new StringBuilder().append(x).reverse().toString().equals(Integer.toString(x));
//    }

    public static void main(String[] args) {
        int x = 1234567899;
        isPalindrome(x);
        String ExpectedOutput = "true";
        System.out.println(isPalindrome(x));
    }
//      for (int j = 1; j < y.length(); j++)
//            for (int i = 0; i +1 < y.length(); i++) {
////  1. get each index for the first characrter of a string
//                char a = y.charAt(i);
////  2. add that string to string cba
//                String cba = "" +a;
//
//            int abc = Integer.parseInt(cba);
////  4. Compare it to x
//                if (abc == x)
//                    return true;
//            }
}
