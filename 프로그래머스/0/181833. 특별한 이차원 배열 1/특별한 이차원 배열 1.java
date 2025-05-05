class Solution {
    public int[][] solution(int n) {
        int[][] a = new int[n][n];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
            }
        }
        return a;
    }
}