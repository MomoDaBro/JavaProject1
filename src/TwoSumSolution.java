import java.util.Arrays;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        int i;

        for (i = 0; i + 1 < nums.length; i++)
            if (nums[i] + nums[i + 1] == target) {
                System.out.println("true");
                return new int[]{i, i + 1};
                }

        for (i = 0; i + 1 < nums.length; i++)
            if (nums[i] + nums[i + 2] == target) {
                System.out.println("true");
                break;}
                return new int[]{i, i + 2};

    }

    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int target = 0;
        int[] ExpectedOutput = {0, 1};
        int[] ActualOutput = twoSum(nums, target);
        System.out.println(Arrays.toString(ActualOutput));
    }
}