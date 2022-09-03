public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        int p = 0;
        while (p < nums.length) {
            if (left == right)
                return p;
            left += nums[p];
            p++;
            if (p <= nums.length - 1) {
                right -= nums[p];
            }

        }
        return -1;
    }
}
