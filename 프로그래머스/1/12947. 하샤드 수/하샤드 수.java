class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String a = Integer.toString(x);
        int x1 = 0;
        
        for (int i=0; i<a.length(); i++) {
            x1 += a.charAt(i) - '0';
        }
        
        if (x % x1 == 0) {
            answer = true;
        }
        
        return answer;
    }
}