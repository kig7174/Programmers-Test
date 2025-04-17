class Solution {
    public String[] solution(String my_str, int n) {
        int strLen = my_str.length();
        int arrLen = (strLen +  n - 1) / n;
        String[] answer = new String[arrLen];
        
        for (int i=0; i<arrLen; i++) {
            int start = i * n;
            int end = Math.min(start + n, strLen);
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}