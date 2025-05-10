class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int p = 0;
        int y = 0;
        String[] a = s.split("");
        
        for (int i=0; i<a.length; i++) {
            if (a[i].equals("p") || a[i].equals("P")) {
                p++;
            } else if (a[i].equals("y") || a[i].equals("Y")) {
                y++;
            }
        }
        
        if (p == y) {
            answer = true;
        }

        return answer;
    }
}