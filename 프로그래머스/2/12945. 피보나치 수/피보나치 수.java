class Solution {
    public int solution(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        
        while(c < n){
            int a1 = a;
            a = b;
            b = (a1 + b) % 1234567;
            c++;
        }
        return b;
    }
}