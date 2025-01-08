class Solution {
    public int solution(int slice, int n) {
        for (int i=1; i<100; i++) {
            if (slice * i >= n) {
                return slice * i / slice;
            }
        }
        return 0;
    }
}