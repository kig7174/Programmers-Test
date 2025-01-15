class Solution {
    public int[][] solution(int[] num_list, int n) {
        int a = num_list.length / n;
        int[][] answer = new int[a][n];
        
        int count = 0;
        for (int i=0; i<answer.length; i++) {
            for (int j=0; j<answer[0].length; j++) {
                answer[i][j] = num_list[count];
                count++;                
            }
        }
        return answer;
    }
}