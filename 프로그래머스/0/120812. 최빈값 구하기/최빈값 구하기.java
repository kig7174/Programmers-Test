import java.util.*;

class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        
        Map<Integer, Integer> list = new HashMap<Integer, Integer>();
        
        for(int number : array) {
            int count = list.getOrDefault(number, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = number;
            }

            else if(count == maxCount) {
                answer = -1;
            }

            list.put(number, count);
        }
        
        return answer;
    }
}