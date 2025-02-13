class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++) {
            for (int j=numbers.length-1; j>i; j--) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        return max;
    }
}