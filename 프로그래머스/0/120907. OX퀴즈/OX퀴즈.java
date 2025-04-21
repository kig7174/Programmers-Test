class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            String[] q = quiz[i].split(" ");
            if (q[1].equals("+")) {
                int a = Integer.parseInt(q[0]) + Integer.parseInt(q[2]);
                if (a == Integer.parseInt(q[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                int a = Integer.parseInt(q[0]) - Integer.parseInt(q[2]);
                if (a == Integer.parseInt(q[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}