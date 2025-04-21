import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a.replaceAll(" ", "");
        b.replaceAll(" ", "");
        
        System.out.println(a + b);
    }
}