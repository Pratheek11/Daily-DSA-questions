public class NextPermutatuion {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 2, 3, 2, 0 };
        nextPermutation(arr);
        for (int i : arr) {
            System.out.print(i + "");
        }
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i])
                j--;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        rev(nums, i + 1, nums.length - 1);
    }

    public static void rev(int[] arr, int i, int j) {
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}
