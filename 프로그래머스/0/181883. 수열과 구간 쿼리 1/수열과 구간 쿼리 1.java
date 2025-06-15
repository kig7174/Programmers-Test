class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            
            for (int i=s; i<=e; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}