import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] a = my_string.replaceAll("[A-Z|a-z]", "").split("");
        
        int[] b = new int[a.length];
        
        for (int i=0; i<a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }
        
        return Arrays.stream(b).sum();
    }
}