import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i=0; i<n; i++) {
            // 현재 가격이 스택 상단 인덱스의 가격보다 낮으면 처리
            while (!deque.isEmpty() && prices[deque.getFirst()] > prices[i]) {
                int idx = deque.removeFirst(); // 스택에서 첫 번째 요소 제거
                result[idx] = i - idx; // 유지 시간 계산
            }

            deque.addFirst(i); // 현재 인덱스를 스택에 추가
        }

        // 스택에 남아 있는 인덱스 처리 (끝까지 가격 유지)
        while (!deque.isEmpty()) {
            int idx = deque.removeFirst(); // 스택에서 첫 번째 요소 제거
            result[idx] = n - idx - 1; // 남은 시간 계산
        }

        return result;
    }
}