public class RichestWealthSolution {
    public int maximumWealth(int[][] accounts) {

// 1. Find out the length of the integer grid and the amount of integers within each account
// 2. Add all of the integers in each array
// 3. compare each final array integer

        int m = accounts.length;
        int n = accounts[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = accounts[i][j];
                int b = +a;

            }


        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
    }

}
