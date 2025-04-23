class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] c = control.split("");
        for (int i=0; i<c.length; i++) {
            switch(c[i]) {
                case "w":
                    n++;
                    break;
                case "s":
                    n--;
                    break;
                case "d":
                    n+=10;
                    break;
                case "a":
                    n-=10;
                    break;
            }
        }
        return n;
    }
}