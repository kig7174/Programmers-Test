class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<10000; i++) {
            if (i % 6 == 0 && i % n == 0) {
                return i / 6;
            }
        }
        
        return 0;
    }
}