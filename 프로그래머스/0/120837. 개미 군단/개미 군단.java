class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        if (hp % 5 != 0) {
            answer += hp / 5;
            int hp1 = hp % 5;
            if (hp1 % 3 != 0) {
                answer += hp1 / 3;
                int hp2 = hp1 % 3;
                if (hp2 > 0) {
                    answer += hp2 / 1;
                }
            } else {
                answer += hp1 / 3;
            }
        } else {
            answer += hp / 5;
        }
        
        // hp / 5 + (hp % 5 / 3) + hp % 5 % 3
        return answer;
    }
}