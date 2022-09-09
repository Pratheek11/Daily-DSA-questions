public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 2, 5, 6, 4, 6, 2, 7 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int cur = 0, max = 0;
        int s = 0, e = height.length - 1;
        while (s < e) {
            cur = (e - s) * Math.min(height[s], height[e]);
            max = Math.max(max, cur);
            if (height[s] > height[e])
                e--;
            else
                s++;
        }
        return max;
    }
}
