import java.util.Arrays;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        System.out.println(nums.length);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums= {2,7,11,15};
        int target = 9;
        int[] ExpectedOutput ={0, 1};
        int[] ActualOutput = twoSum(nums,target);
        System.out.println(Arrays.toString(ActualOutput));


    }
}



