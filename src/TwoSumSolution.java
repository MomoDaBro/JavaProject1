import java.util.Arrays;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        for (int j = 1; j < nums.length; j++)
            for (int i = 0; i + j < nums.length; i++)
                if (nums[i] + nums[i + j] == target) {
                    System.out.println("true");
                    return new int[]{i, i + j};
                }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {3, 0,0,0,0,0, 3};
        int target = 6;
        int[] ExpectedOutput = {0, 6};
        int[] ActualOutput = twoSum(nums, target);
        System.out.println(Arrays.toString(ActualOutput));
    }

//    for (i = 0; i + 2 < nums.length; i++)
//            if (nums[i] + nums[i + 2] == target) {
//        System.out.println("true");
//        return new int[]{i, i + 2};
//    }
//        for (i = 0; i + 3 < nums.length; i++)
//            if (nums[i] + nums[i + 3] == target) {
//        System.out.println("true");
//        return new int[]{i, i + 3};
}