import java.util.*;

public class LargestRectangleInHistogram {
    static private class Item {
        public int index;
        public int height;

        public static Item create(int index, int height) {
            Item item = new Item();
            item.index = index;
            item.height = height;
            return item;
        }
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Item> stack = new Stack<Item>();
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; ++i) {
            int index = i;
            while (!stack.isEmpty() && stack.peek().height > heights[i]) {
                Item item = stack.pop();
                maxArea = Math.max(maxArea, item.height * (i - item.index));
                index = item.index;
            }
            stack.push(Item.create(index, heights[i]));
        }
        while (!stack.isEmpty()) {
            Item item = stack.pop();
            maxArea = Math.max(maxArea, (heights.length - item.index) * item.height);
        }
        return maxArea;
    }
}
