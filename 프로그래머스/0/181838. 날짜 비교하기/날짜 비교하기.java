class Solution {
    public int solution(int[] date1, int[] date2) {
        String a = "" + date1[0] + date1[1] + date1[2];
        String b = "" + date2[0] + date2[1] + date2[2];
        return Integer.parseInt(b) - Integer.parseInt(a) > 0 ? 1 : 0;
    }
}