import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length > 10) {
            answer = Arrays.stream(num_list).sum();
        } else {
            answer = 1;
            for (int i=0; i<num_list.length; i++) {                
                answer *= num_list[i];
            }
        }
        return answer;
    }
}