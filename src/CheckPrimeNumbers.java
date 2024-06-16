import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr num");
        int num = sc.nextInt();
        if (num == 1) System.out.println("Not prime " + num);
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                System.out.println("Not prime " + num);

        }
        System.out.println("prime " + num);

    }
}

