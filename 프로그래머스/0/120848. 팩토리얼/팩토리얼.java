class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        int i = 1;
        
        // for (int i=1; i<=n; i++) {
        //     a *= i;
        //     if (n == 1) {
        //         return 1;
        //     } else if (a > n) {
        //         return i - 1;
        //     }
        // }
        while(true) {
            a *= i;
            if (a > n) {
                answer = i;
                break;
            }
            i++;
        }
        return answer - 1;
    }
}