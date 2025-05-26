class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] a = new int[30];
        
        for (int i=0; i<strArr.length; i++) {
            a[strArr[i].length() - 1]++;
        }
        
        for (int a1 : a) {
            if (answer < a1) {
                answer = a1;
            }
        }
        
        return answer;
    }
}