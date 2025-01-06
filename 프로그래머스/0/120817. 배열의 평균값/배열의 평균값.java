import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        OptionalDouble a = Arrays.stream(numbers).average();
        System.out.println(a);
        return a.orElse(1);
    }
}