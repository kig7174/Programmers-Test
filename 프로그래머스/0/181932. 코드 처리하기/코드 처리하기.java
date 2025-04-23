class Solution {
    public String solution(String code) {
        String answer = "";
        String[] co = code.split("");
        int mode = 0;
        
        for (int i=0; i<co.length; i++) {
            String c = co[i];
            if (mode == 0) {
                if (!c.equals("1")) {
                    if(i % 2 == 0) answer += c;
                } else {
                    mode = 1;
                }
            } else {
                if (!c.equals("1")) {
                    if(i % 2 == 1) answer += c;
                } else {
                    mode = 0;
                }
                    
            }
        }
        return answer.equals("") ? "EMPTY" : answer;
    }
}