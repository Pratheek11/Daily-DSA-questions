public class JumpGame1 {
    public static void main(String[] args) {

    }

    public boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return (lastPos == 0);
    }
}
