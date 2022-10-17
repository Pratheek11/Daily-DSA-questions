// https://leetcode.com/problems/push-dominoes/

public class PushDominos {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        System.out.println(pushDominoes("RR.L"));
    }

    public static String pushDominoes(String dominoes) {
        int count = 0;
        char last = 'L';
        for (char ch : dominoes.toCharArray()) {
            if (ch != '.') {
                if (ch == last)
                    add(count, last); // case LL & RR
                else if (last == 'L')
                    add(count, '.'); // case LR
                else { // case RL
                    add(count / 2, 'R');
                    if (count % 2 != 0)
                        sb.append('.');
                    add(count / 2, 'L');
                }
                sb.append(ch);
                last = ch;
                count = 0;
            } else
                count++;
        }
        add(count, last == 'R' ? 'R' : '.'); // for trailing '.'s
        return sb.toString();
    }

    static void add(int count, char ch) { // append 'ch' to sb 'count' times
        for (int i = 0; i < count; i++)
            sb.append(ch);
    }
}
