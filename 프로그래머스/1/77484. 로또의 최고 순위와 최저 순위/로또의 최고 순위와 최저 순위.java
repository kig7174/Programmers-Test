import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;
        for (int i=0; i<lottos.length; i++) {
            for (int j=0; j<win_nums.length; j++) {
                if (lottos[i] != 0 && lottos[i] == win_nums[j]) {
                    a++;
                }
            }
            
            if (lottos[i] == 0) {
                b++;
            }
        }
        
        answer[0] = 7 - a - b;
        answer[1] = 7 - a;
        if (answer[0] > 6) answer[0] = 6;
        if (answer[1] > 6) answer[1] = 6;
        
        return answer;
    }
}