class RunningSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = runningSum(arr);
    }

    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += sum;
            sum = nums[i];
        }
        return nums;
    }
}