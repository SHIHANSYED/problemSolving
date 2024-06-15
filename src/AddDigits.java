
//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
//
//
//
// Example 1:
//
//Input: num = 38
//Output: 2
//Explanation: The process is
//38 --> 3 + 8 --> 11
//        11 --> 1 + 1 --> 2
//Since 2 has only one digit, return it.


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


