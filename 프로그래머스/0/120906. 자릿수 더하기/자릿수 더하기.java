class Solution {
    public int solution(int n) {
        String a = n + "";
        int answer = 0;
        for (int i=0; i<a.length(); i++) {
            answer += Character.getNumericValue(a.charAt(i));
        }
        return answer;
    }
}