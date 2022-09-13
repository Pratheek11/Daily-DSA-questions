public class MaximumPointsFromCards {
    public static void main(String[] args) {
        int[] cardPoints = { 1, 2, 3, 4, 5, 6, 1 };
        System.out.println(maxScore(cardPoints, 3));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int i = 0, j = cardPoints.length - 1;
        int curSum = 0, ak = k;
        while (ak > 0) {
            curSum += cardPoints[j];
            j--;
            ak--;
        }
        j++;
        sum = Math.max(sum, curSum);
        while (k > 0) {
            curSum -= cardPoints[j];
            curSum += cardPoints[i];
            j++;
            i++;
            k--;
            sum = Math.max(sum, curSum);
        }
        return sum;
    }

    // public static int maxScore(int[] cardPoints, int k) {
    // int sum = 0;
    // for (int i : cardPoints) {
    // sum += i;
    // }
    // if (k >= cardPoints.length)
    // return sum;
    // sum = 0;
    // int i = 0, j = 0, curSum = 0, ak = k;
    // while (j < cardPoints.length) {
    // curSum += cardPoints[j];
    // sum = Math.max(sum, curSum);
    // ak--;
    // j++;
    // while (ak <= 0 && i < cardPoints.length) {
    // curSum -= cardPoints[i];
    // i++;
    // ak++;
    // }
    // }

    // return sum;
    // }

}
