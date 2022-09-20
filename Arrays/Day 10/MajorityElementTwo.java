import java.util.*;

public class MajorityElementTwo {

    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        for (int i : nums) {
            memo.put(i, memo.getOrDefault(i, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i : memo.keySet()) {
            if (memo.get(i) > nums.length / 3) {
                ans.add(i);
            }
        }
        return ans;
    }
}
