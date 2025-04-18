class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i=0; i<schedules.length; i++) {
            int time = (schedules[i] + 10) % 100 > 59 ? schedules[i] + 50 : schedules[i] + 10;
            int yes = 0;
            
            for (int j=0; j<timelogs[i].length; j++) {
                if (startday > 7) startday = 1;
                
                if (startday < 6 && timelogs[i][j] <= time) {
                    yes++;
                }
                
                startday++;
            }
            if (yes == 5) answer++;
        }
        return answer;
    }
}