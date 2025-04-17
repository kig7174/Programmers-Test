class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] eng = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        for (int i=0; i<eng.length; i++) {
            numbers = numbers.replaceAll(eng[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}