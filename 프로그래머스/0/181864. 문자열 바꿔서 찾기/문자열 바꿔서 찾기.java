class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String a = "";
        for (int i=0; i<myString.length(); i++) {
            if (String.valueOf(myString.charAt(i)).equals("A")) {
                a += "B";
            } else {
                a += "A";
            }
        }
        return a.contains(pat) ? 1 : 0;
    }
}