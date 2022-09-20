//Print the pattern for given num 
//EX
// input: 3
// output:
// [1, *, 2, *, 3][*10, *11, *12]
// --[4, *, 5][*8, *9]
// ----[6][*7]

//input: 7
//output:
// [1, *, 2, *, 3, *, 4, *, 5, *, 6, *, 7][*50, *51, *52, *53, *54, *55, *56]
// --[8, *, 9, *, 10, *, 11, *, 12, *, 13][*44, *45, *46, *47, *48, *49]
// ----[14, *, 15, *, 16, *, 17, *, 18][*39, *40, *41, *42, *43]
// ------[19, *, 20, *, 21, *, 22][*35, *36, *37, *38]
// --------[23, *, 24, *, 25][*32, *33, *34]
// ----------[26, *, 27][*30, *31]
// ------------[28][*29]

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int beg = 1;
    int N = n;
    int max = n * (n + 1);
    int loop = n;
    int dash = 0;

    while (N-- > 0) {
      String s = "";
      ArrayList<String> ans = new ArrayList<>();
      loop = n;
      while (loop-- > 0) {
        ans.add(beg++ + "");
        if (loop + 1 > 1)
          ans.add("*");
      }
      loop = n;
      s = s + ans.toString();
      ans = new ArrayList<>();
      while (loop-- > 0) {
        ans.add("*" + max--);
      }
      Collections.reverse(ans);
      s = s + ans;
      String das = "";
      for (int k = 0; k < dash; k++) {
        das += "-";
      }
      s = das + s;
      dash += 2;
      n--;
      System.out.println(s);
      sc.close();
    }
  }
}