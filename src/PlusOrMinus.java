//You are given three integers a , b and c
//such that exactly one of these two equations is true:
//a+b=c
//a−b=c
//Output + if the first equation is true, and - otherwise.
//        Input
//The first line contains a single integer t
//        (1≤t≤162
//        ) — the number of test cases.
//
//The description of each test case consists of three integers a b c
//        (1≤a,b≤9
//                , −8≤c≤18
//        ). The additional constraint on the input: it will be generated so that exactly one of the two equations will be true.
//
//Output
//For each test case, output either + or - on a new line, representing the correct equation.


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
