public class JumpGame2 {
    public static void main(String[] args) {

    }

    public static int jump(int[] arr) {
        if (arr.length == 1)
            return 0;
        if (arr[0] == 0)
            return -1;
        int jumps = 0;
        int l = 0, r = 0;
        while (r < arr.length - 1) {
            int tmp = 0;
            for (int i = l; i <= r; i++) {
                tmp = Math.max(tmp, i + arr[i]);
            }
            l = r + 1;
            r = tmp;
            jumps++;
        }
        return jumps;
    }
}
