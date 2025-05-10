class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        boolean answer = false;
        int p = 0;
        int y = 0;
        String[] a = s.split("");
        
        for (int i=0; i<a.length; i++) {
            if (a[i].equals("p")) {
                p++;
            } else if (a[i].equals("y")) {
                y++;
            }
        }
        
        if (p == y) {
            answer = true;
        }

        return answer;
    }
}