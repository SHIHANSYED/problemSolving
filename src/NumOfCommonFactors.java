//https://leetcode.com/problems/number-of-common-factors/

import java.util.Scanner;

public class NumOfCommonFactors {

    public static void main(String[] args) {
        System.out.println("Enter the numbers");
       Scanner sc= new Scanner(System.in);
       int a = sc.nextInt();
       int b= sc.nextInt();
       int result =check(a,b);
        System.out.println(result);
    }

    public static int check(int a, int b) {
        int result=0;
        for (int i=1; i <= Math.min(a,b); i++ ){
            if (a%i==0 && b%i==0) result++;
        }
        return result;
    }
}
