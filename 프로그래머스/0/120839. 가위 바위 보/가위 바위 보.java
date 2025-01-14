import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (int i=0; i<rsp.length(); i++) {
            int a = Character.getNumericValue(rsp.charAt(i));
            if (a == 0) {
                answer += 5;
            } else if (a == 2) {
                answer += 0;
            } else {
                answer += 2;
            }
        }
        return answer;
    }
}