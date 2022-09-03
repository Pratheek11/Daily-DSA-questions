import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = { -7, -3, 2, 3, 11 };
        // int[] ans = sortedSquares(nums);
        int[] ans = sorted(nums);
        System.out.println(ans.toString());
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sorted(int[] nums) {
        int p = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                p = i;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int l = p - 1;
        int r = p;
        int k = 0;
        int[] ans = new int[nums.length];
        while (l >= 0 && r < nums.length) {
            if (nums[l] < nums[r]) {
                ans[k++] = nums[l--];
            } else if (nums[l] >= nums[r]) {
                ans[k++] = nums[r++];
            }
        }
        while (l >= 0) {
            ans[k++] = nums[l--];
        }
        while (r < nums.length) {
            ans[k++] = nums[r++];
        }
        // Arrays.sort(nums);
        return ans;
    }
}
