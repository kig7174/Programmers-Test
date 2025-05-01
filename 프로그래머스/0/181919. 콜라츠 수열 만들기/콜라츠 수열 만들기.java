import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(n);
        while(n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                a.add(n);
            } else {
                n = 3 * n + 1;
                a.add(n);
            }
        }
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}