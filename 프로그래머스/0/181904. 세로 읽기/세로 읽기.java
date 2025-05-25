class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int a = my_string.length();
        for(int i = c - 1; i < a; i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}