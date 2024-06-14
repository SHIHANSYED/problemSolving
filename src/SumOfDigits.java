import java.util.Scanner;


//Given a number, N. Find the sum of all the digits of N
//
//
//Example 1:
//
//Input:
//N = 12
//Output:
//        3
//Explanation:
//Sum of 12's digits:
//        1 + 2 = 3

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;

        for (; N > 0; N /= 10) {
          sum+=N%10;
        }
        System.out.println(sum);
    }
}
