//https://codeforces.com/problemset/problem/1807/A


import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        System.out.print("Enter the number of test cases ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the numbers you want to test");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b == c) System.out.println("+");
            else System.out.println("-");
        }
    }
}
