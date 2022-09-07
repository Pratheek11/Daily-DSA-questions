public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod = 1, zeroP = 1, countZ = 0;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            if (nums[i] != 0) {
                zeroP *= nums[i];
            }
            if (nums[i] == 0)
                countZ++;
            if (countZ > 1) {
                prod = 0;
                zeroP = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                ans[i] = prod / nums[i];
            else
                ans[i] = zeroP;
        }
        return ans;
    }
}
