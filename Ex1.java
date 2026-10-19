package lab_one;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n;

		int sum = 0;
		float average = 0;
		System.out.print("Enter a number :");
		n = sc.nextInt();
		
		for (int K=1000; K>=n; K--) {
			System.out.print(K + " ");
			sum += K;
			average = sum/(1000-n + 1 );
		}
		System.out.println();
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		
		sc.close();
	}

}
