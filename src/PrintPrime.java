import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        System.out.print("Enter the limit : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {

            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("prime " + i);
            } else System.out.println("not prime " + i);

        }
    }
}

