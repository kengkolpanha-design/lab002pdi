package lab_one;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 2) {

            System.out.println(
                "Please enter a number greater than or equal to 2."
            );

        } else {

            System.out.println(
                "All prime numbers from 2 to " + n + ":"
            );

            for (int i = 2; i <= n; i++) {

                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
