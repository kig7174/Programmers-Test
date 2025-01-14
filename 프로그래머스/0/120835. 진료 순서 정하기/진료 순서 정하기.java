import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        Integer[] copy = new Integer[n];
        
        for (int i=0; i<n; i++) {
            copy[i] = emergency[i];
        }
        
        Arrays.sort(copy, Collections.reverseOrder());
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (emergency[i] == copy[j]) {
                    answer[i] = j+1;
                }
            }
        }
        
        return answer;
    }
}