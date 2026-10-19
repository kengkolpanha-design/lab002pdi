package lab_one;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year, month, day;
        boolean valid = true;

        System.out.print("Input date (yyyy-mm-dd): ");

        String date = sc.next();

        String[] parts = date.split("-");

        year = Integer.parseInt(parts[0]);
        month = Integer.parseInt(parts[1]);
        day = Integer.parseInt(parts[2]);

        if (month < 1 || month > 12) {
            valid = false;
        }

        if (valid) {

            if (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 ||
                month == 12) {

                if (day < 1 || day > 31) {
                    valid = false;
                }

            } else if (month == 4 || month == 6 ||
                       month == 9 || month == 11) {

                if (day < 1 || day > 30) {
                    valid = false;
                }

            } else if (month == 2) {

                if ((year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0)) {

                    if (day < 1 || day > 29) {
                        valid = false;
                    }

                } else {

                    if (day < 1 || day > 28) {
                        valid = false;
                    }
                }
            }
        }

        if (valid) {
            System.out.println("Output: valid");
        } else {
            System.out.println("Output: invalid");
        }

        sc.close();
    }
}
