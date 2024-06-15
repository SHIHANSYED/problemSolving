import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the limit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 1)
            System.out.println("No " + num);
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("No " + num);
                return;
            }

        }
        System.out.println("Yes " + num);

    }
}

