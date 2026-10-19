package lab_one;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char choice;
        
        System.out.println("===============================================================================");
        System.out.println("\t\tWelcome to our program");
        System.out.println("\t'Quadratic Equation Solver ax² + bx + c = 0'");
        System.out.println("===============================================================================\n");

        do {

            int a, b, c;
            double x1, x2, x3, x4;
            double delta;


            System.out.print("Input a: ");
            a = sc.nextInt();

            System.out.print("Input b: ");
            b = sc.nextInt();

            System.out.print("Input c: ");
            c = sc.nextInt();

            System.out.println();

            System.out.println("--------------------------------------------------------------------------------");

            if (a == 0) {
                System.out.println("Roots of this equation: " + b + "x + " + c + " = 0 are:");
            } else {
                System.out.println("Roots of this equation: " + a + "x² + "
                        + b + "x + " + c + " = 0 are:");
            }

            delta = (b * b) - 4 * a * c;

            if (delta > 0) {

                if (a == 0) {

                    x4 = (double) -c / b;
                    System.out.println("X = " + x4);

                } else {

                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);

                    System.out.println("X1 = " + x1);
                    System.out.println("X2 = " + x2);
                }

            } else if (delta == 0) {

                x3 = (double) -b / (2 * a);
                System.out.println("X = " + x3);

            } else {

                System.out.println("Equation has no real roots");
            }

            System.out.println("--------------------------------------------------------------------------------");

            System.out.print("Do you want to solve another equation? (y/n): ");
            choice = sc.next().charAt(0);

            System.out.println();

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using our program!");

        sc.close();
    }
}
