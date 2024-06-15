import java.util.Scanner;
//https://leetcode.com/problems/ugly-number/

public class UglyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int N = sc.nextInt();
        System.out.println(uglyNumber(N) ? "True" : "False");
    }

    public static boolean uglyNumber(int N) {
        if (N <= 0) return false;
        while (N % 2 == 0) N /= 2;
        while (N % 3 == 0) N /= 3;
        while (N % 5 == 0) N /= 5;
        return N == 1;
    }
}
