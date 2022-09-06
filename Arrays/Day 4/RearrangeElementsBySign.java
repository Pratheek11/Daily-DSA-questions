public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] nums = { -3, -1, -2, 1, 2, 3 };
        int[] ans = rearrangeArray(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int i = 0, k = nums.length / 2;
        int[] ans = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < 0)
                ans[k++] = nums[j];
            if (nums[j] >= 0)
                ans[i++] = nums[j];
        }
        i = 0;
        int j = nums.length / 2;
        k = 0;
        while (k < nums.length) {
            nums[k++] = ans[i++];
            nums[k++] = ans[j++];
        }
        return nums;
    }
}
