public class ListPractice {

    public static void main(String[] args) {
        int target = 0;
        int[] nums = {3, 41, 62, 87, 101, 88};
        for (int i = 0; i < nums.length; i++)
            target = target + nums[i];
        System.out.println(target);
    }
}


