public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 0, 0, 0 };
        int[] nums2 = { 5, 4, 3 };
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[nums1.length];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }
        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }
        for (int l = 0; l < ans.length; l++) {
            nums1[l] = ans[l];
        }
    }
}
