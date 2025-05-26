class Solution {
    public String solution(String my_string, int[] indices) {
        String[] s = my_string.split("");

        for (int i : indices) {
            s[i] = "";
        }

        return String.join("", s);
    }
}