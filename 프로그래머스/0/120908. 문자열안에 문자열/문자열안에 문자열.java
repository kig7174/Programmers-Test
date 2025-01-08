class Solution {
    public int solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);
        return sb.indexOf(str2) > -1 ? 1 : 2;
    }
}