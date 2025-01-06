import java.util.*;

class Solution
{
    public int solution(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (!deque.isEmpty() && deque.peekFirst().equals(ch)) {
                deque.pollFirst();
            } else {
                deque.addFirst(ch);
            }
        }

        return deque.isEmpty() ? 1 : 0;
    }
}