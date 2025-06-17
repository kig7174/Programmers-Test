class Solution {
    public String solution(String myString, String pat) {
        int a = myString.lastIndexOf(pat);
        int b = pat.length();
        String answer = myString.substring(0, a + b);
        return answer;
    }
}