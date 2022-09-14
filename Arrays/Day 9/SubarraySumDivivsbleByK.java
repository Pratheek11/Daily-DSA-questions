import java.util.*;

public class SubarraySumDivivsbleByK {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        System.out.println(subarraysDivByK(nums, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i : nums) {
            sum += i;
            int r = sum % k;

            if (r < 0) {
                r += k;
            }

            if (map.containsKey(r)) {
                count += map.get(r);
            }

            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        return count;
    }
}
