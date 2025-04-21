class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            String[] q = quiz[i].split(" ");
            if (q[1].equals("+")) {        
                answer[i] = Integer.parseInt(q[0]) + Integer.parseInt(q[2]) == Integer.parseInt(q[4]) ? "O" : "X";
            } else {
                answer[i] = Integer.parseInt(q[0]) - Integer.parseInt(q[2]) == Integer.parseInt(q[4]) ? "O" : "X";
            }
        }
        
        return answer;
    }
}