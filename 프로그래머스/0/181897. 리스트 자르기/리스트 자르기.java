import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        if (n == 1) {
            answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
        } else if (n == 2) {
            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
        } else if (n == 3) {
            answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
        } else {
            int[] a = new int[(slicer[1] - slicer[0] + 2) / 2];
            int b = 0;
            for (int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                a[b] = num_list[i];
                b++;
            }
            answer = a;
        }
        return answer;
    }
}