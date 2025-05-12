import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int a = Arrays.stream(numbers).sum();
        return 45 - a;
    }
}