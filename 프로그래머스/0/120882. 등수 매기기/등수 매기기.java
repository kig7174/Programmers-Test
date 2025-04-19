class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sumArr = new int[score.length];
        
        for (int i=0; i<score.length; i++) {
            sumArr[i] = score[i][0] + score[i][1];
        }
        
        for (int i=0; i<sumArr.length; i++) {
            int a = 1;
            
            for (int j=0; j<sumArr.length; j++) {
                if (sumArr[i] < sumArr[j]) {
                    a++;
                }
                
            answer[i] = a;
            }
        }
        return answer;
    }
}