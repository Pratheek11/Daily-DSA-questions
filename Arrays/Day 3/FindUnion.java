import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindUnion {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3 };
        ArrayList<Integer> ans = findUnion(arr1, arr2, 5, 3);
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        for (int it : s)
            Union.add(it);
        Collections.sort(Union);
        return Union;
    }
}
