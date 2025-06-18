import java.util.*;

public class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int a = Integer.MAX_VALUE;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < a) {
                    a = arr[j];
                }
            }

            if (a != Integer.MAX_VALUE) {
                answer[i] = a;
            }
        }

        return answer;
    }

}