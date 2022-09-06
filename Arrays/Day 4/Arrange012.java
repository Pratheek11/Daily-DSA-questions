public class Arrange012 {
    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 1, 2, 0 };
        sort012(a, 6);
    }

    public static void sort012(int a[], int n) {
        // code here
        //

        int low = 0, high = n - 1, mid = 0;
        int temp = 0;
        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }
        // System.out.print(Arrays.toString(a));
    }

}
