class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String a = Integer.toString(num);
        String[] b = a.split("");
        
        for (int i=0; i<b.length; i++) {
            if (b[i].equals(Integer.toString(k))) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}