import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int v : arr) {
            if (stack.isEmpty() || !stack.peek().equals(v)) {
                stack.push(v);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}