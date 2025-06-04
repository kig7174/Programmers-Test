class Solution {
    public String solution(String my_string, int s, int e) {
        String x = my_string.substring(0, s);
        String y = my_string.substring(e + 1, my_string.length());
        String a = my_string.substring(s, e + 1);
        
        for (int i=a.length() - 1; i>=0; i--) {
            x += a.charAt(i);
        }
        
        return x + y;
    }
}