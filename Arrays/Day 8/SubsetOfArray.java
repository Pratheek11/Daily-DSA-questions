import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ans = subsets(nums);
        for (List<Integer> i : ans) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> mem = new ArrayList<>();
        sub(nums, 0, ans, mem);
        return ans;
    }

    public static void sub(int[] nums, int ind, List<List<Integer>> ans, List<Integer> mem) {
        if (ind >= nums.length) {
            ans.add(new ArrayList<>(mem));
            return;
        }
        List<Integer> tmp = new ArrayList<>(mem);
        sub(nums, ind + 1, ans, tmp);
        if (!mem.contains(nums[ind]))
            tmp.add(nums[ind]);
        sub(nums, ind + 1, ans, tmp);
    }
}
