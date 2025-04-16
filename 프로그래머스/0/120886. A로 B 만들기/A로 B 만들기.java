import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        String b1 = new String(b);
        String a1 = new String(a);
        
        return b1.equals(a1) ? 1 : 0;
    }
}