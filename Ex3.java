package lab_one;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b, c , d, e;
		int min , max ;
		System.out.println("Input 5 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		List<Integer> numbers = Arrays.asList(a,b,c,d,e);
		min = Collections.min(numbers);
		max = Collections.max(numbers);
		
		System.out.println("\nOutput: ");
		System.out.println("Among all five input numbers (" + a + ", " + b + ", " + c + ", " + d + " and " + e + "), min is " + min + " and max is " + max + ".");
		
		sc.close();
	}

}
