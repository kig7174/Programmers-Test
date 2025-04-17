class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String k1 = String.valueOf(k);
        for (int x=i; x<=j; x++) {
            String y = String.valueOf(x);
            if (y.contains(k1)) {
                String[] y1 = y.split("");
                for (String y2 : y1) {
                    if (y2.equals(k1)) answer++;
                }
            }
        }
        return answer;
    }
}