import java.util.ArrayList;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        // setZeroes(matrix);
        setZeroes2(matrix);
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Little logic changes needed
    // public static void setZeroes(int[][] matrix) {
    // int i = 0, j = 0, k = 0;
    // while (i < matrix.length && j < matrix[0].length) {
    // if (matrix[i][j] == 0) {
    // k = 0;
    // while (k < matrix[0].length) {
    // if (matrix[i][k] != 0)
    // matrix[i][k++] = -1;
    // else
    // k++;
    // }
    // k = 0;
    // while (k < matrix.length) {
    // if (matrix[k][j] != 0)
    // matrix[k++][j] = -1;
    // else
    // k++;
    // }
    // }
    // j++;
    // if (j >= matrix.length) {
    // i++;
    // j = 0;
    // }
    // }
    // for (i = 0; i < matrix.length; i++) {
    // for (j = 0; j < matrix[0].length; j++) {
    // if (matrix[i][j] == -1)
    // matrix[i][j] = 0;
    // }
    // }
    // }

    public static void setZeroes2(int[][] matrix) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    ans.add(tmp);
                }
            }
        }
        for (ArrayList<Integer> i : ans) {
            int j = i.get(0);
            int k = i.get(1);
            for (int z = 0; z < matrix.length; z++)
                matrix[z][k] = 0;
            for (int z = 0; z < matrix[0].length; z++)
                matrix[j][z] = 0;
        }
    }
}
