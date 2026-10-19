package lab_one;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mathScore, englishScore, physicsScore, programmingScore;
        int Max, Min;

        System.out.println("Input your scores of 4 subjects (Math, English, Physics, and Programming):");

        String subjects = sc.nextLine().trim();
        String[] MEPP = subjects.split("\\s+");

        mathScore = Integer.parseInt(MEPP[0]);
        englishScore = Integer.parseInt(MEPP[1]);
        physicsScore = Integer.parseInt(MEPP[2]);
        programmingScore = Integer.parseInt(MEPP[3]);

        List<Integer> MEPP_result = Arrays.asList(
                mathScore, englishScore, physicsScore, programmingScore
        );

        Max = Collections.max(MEPP_result);
        Min = Collections.min(MEPP_result);

        double Average = (mathScore + englishScore + physicsScore + programmingScore) / 4.0;

        System.out.println("\nOutput:");

        System.out.print("Max score is: " + Max + " (");

        boolean first = true;

        if (mathScore == Max) {
            System.out.print("Math");
            first = false;
        }

        if (englishScore == Max) {
            if (!first) System.out.print(" and ");
            System.out.print("English");
            first = false;
        }

        if (physicsScore == Max) {
            if (!first) System.out.print(" and ");
            System.out.print("Physics");
            first = false;
        }

        if (programmingScore == Max) {
            if (!first) System.out.print(" and ");
            System.out.print("Programming");
        }

        System.out.println(" courses).");

        // Display minimum score and subjects
        System.out.print("Min score is: " + Min + " (");

        first = true;

        if (mathScore == Min) {
            System.out.print("Math");
            first = false;
        }

        if (englishScore == Min) {
            if (!first) System.out.print(" and ");
            System.out.print("English");
            first = false;
        }

        if (physicsScore == Min) {
            if (!first) System.out.print(" and ");
            System.out.print("Physics");
            first = false;
        }

        if (programmingScore == Min) {
            if (!first) System.out.print(" and ");
            System.out.print("Programming");
        }

        System.out.println(" course).");
        
        System.out.println("Average score of this student is: " + Average);

        sc.close();
    }
}
