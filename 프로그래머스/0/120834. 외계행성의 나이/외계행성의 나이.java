import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String ages = String.valueOf(age);
        char[] a = {'a','b','c','d','e','f','g','h','i','j'};
            
        for (int i=0; i<ages.length(); i++) {
            int b = Character.getNumericValue(ages.charAt(i));
            answer += a[b];
        }
        
        return answer;
    }
}