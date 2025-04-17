import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] + sides[1];
        
        Arrays.sort(sides);
        
        for (int i=1; i<max; i++) {
            // 가장 긴 변이 sides[1]
            if (sides[1] < sides[0] + i && i <= sides[1]) {
                answer++;
            // 가장 긴 변이 나머지
            } else if (i > sides[1] && i < max) {
                answer++;
            }
        }
        return answer;
    }
}