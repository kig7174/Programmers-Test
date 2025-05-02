class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] b = binomial.split(" ");
        if (b[1].equals("+")) {
            answer = Integer.parseInt(b[0]) + Integer.parseInt(b[2]);
        } else if (b[1].equals("-")) {
            answer = Integer.parseInt(b[0]) - Integer.parseInt(b[2]);
        } else {
            answer = Integer.parseInt(b[0]) * Integer.parseInt(b[2]);
        }
        return answer;
    }
}