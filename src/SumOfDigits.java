import java.util.Scanner;
//https://www.geeksforgeeks.org/problems/sum-of-digits1742/1

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
