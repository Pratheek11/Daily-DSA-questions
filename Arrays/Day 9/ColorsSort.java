public class ColorsSort {
    public static void main(String[] args) {

    }

    public static void sortColors(int[] a) {
        int i = 0, j = a.length - 1, m = 0;
        while (m <= j) {
            switch (a[m]) {
                case 0:
                    int tmp = a[i];
                    a[i] = a[m];
                    a[m] = tmp;
                    m++;
                    i++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    tmp = a[j];
                    a[j] = a[m];
                    a[m] = tmp;
                    j--;
                    break;
            }
        }
    }
}
