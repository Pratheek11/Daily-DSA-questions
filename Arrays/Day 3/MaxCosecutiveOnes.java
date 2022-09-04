public class MaxCosecutiveOnes {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0, max = 0;
        for (int i : nums) {
            if (i == 1) {
                cur += 1;
            } else {
                max = Math.max(max, cur);
                cur = 0;
            }
            max = Math.max(max, cur);
        }
        return max;
    }
}
