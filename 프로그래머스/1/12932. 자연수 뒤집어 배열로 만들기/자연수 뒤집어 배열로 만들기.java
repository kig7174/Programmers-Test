class Solution {
    public int[] solution(long n) {
        
        String str = new StringBuilder(String.valueOf(n)).reverse().toString();
        return str.chars().map(c -> c - '0').toArray();
    }
}