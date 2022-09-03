import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4, 4, 2 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -99;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > max) {
                max = map.get(nums[i]);
                index = i;
            }
        }
        return nums[index];
    }
}
