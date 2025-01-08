class Solution {
    public int[] solution(String[] strlist) {
        int[] a = new int[strlist.length];
        for (int i=0; i<strlist.length; i++) {
           a[i] = strlist[i].length();
        }
        
        return a;
    }
}