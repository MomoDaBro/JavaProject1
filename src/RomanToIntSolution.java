public class RomanToIntSolution {


    public static int romanToInt(String s) {
        int r = 0;

            for (int i = 0; i < s.length(); i++) {
                char a = s.charAt(i);
                if (a == 'M') {
                    if (i > 0 && s.charAt(i - 1) == 'C')
                        r += 800;
                    else
                        r += 1000;
                }
                if (a == 'D') {
                    if (i > 0 && s.charAt(i - 1) == 'C')
                        r += 300;
                    else
                        r += 500;
                }
                if (a == 'C') {
                    if (i > 0 && s.charAt(i - 1) == 'X')
                        r += 80;
                    else
                        r += 100;
                }
                if (a == 'L') {
                    if (i > 0 && s.charAt(i - 1) == 'X')
                        r += 30;
                    else
                        r += 50;
                }
                if (a == 'X') {
                    if (i > 0 && s.charAt(i - 1) == 'I')
                        r += 8;
                    else
                        r += 10;
                }
                if (a == 'V') {
                    if (i > 0 && s.charAt(i - 1) == 'I')
                        r += 3;
                    else
                        r += 5;
                }
                if (a == 'I') {
                    r += 1;
                }



//  1. identify the roman numeral
//  2. change that numeral into an integer
//  3. add that integer into an empty integer
//  4. repeat the loop until we reach the string length
            }
            return r;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int ExpectedOutput = 1994;
        System.out.println(romanToInt(s));
    }
}
