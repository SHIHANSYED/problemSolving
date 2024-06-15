//https://leetcode.com/problems/add-digits/description

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {

        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = addDigits(N);
        System.out.println("The result is = " + result);
    }

    public static int addDigits(int N) {
        while (N > 9) {
            int curr = 0;
            while (N > 0) {
                curr += N % 10;
                N /= 10;
            }
            N = curr;
        }
        return N;
    }


}


