import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        
        for (int i=0; i<n; i++) {
            for (int j=i + 1; j<n; j++) {
                result[i]++;

                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return result;
    }
}