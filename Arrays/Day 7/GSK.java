import java.util.Arrays;

public class GSK {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 1 };
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int i = arr.length - 1;
        int j = arr.length - 2;
        int sum = 0;
        while (j >= 0) {
            sum += (arr[i] - arr[j]);
            i -= 2;
            j -= 2;
        }
        return sum;
    }
}
