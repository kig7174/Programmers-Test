import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int str = Integer.parseInt(a + "" + b);
        
        int x = 2 * a * b;
        
        return str >= x ? str : x;
    }
}