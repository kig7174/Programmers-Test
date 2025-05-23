class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] a = n_str.split("");
        
        for (int i=0; i<a.length; i++) {
            if (!a[i].equals("0")) {
                answer = n_str.substring(i, n_str.length());
                break;
            }
        }
        return answer;
    }
}