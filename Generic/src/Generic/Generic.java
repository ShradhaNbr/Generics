package Generic;

import java.util.Scanner;

public class Generic {
	public static void main(String[] args) {
		Integer x1, x2, x3;
		Float y1, y2, y3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integer numbers");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		x3 = sc.nextInt();
		findIntMax(x1, x2, x3);
		System.out.println("Enter 3 float numbers");
		y1 = sc.nextFloat();
		y2 = sc.nextFloat();
		y3 = sc.nextFloat();
		findFloatMax(y1, y2, y3);
		sc.close();
	}

	/*
	 * Method to compare three integer values and get the maximum value.
	 * 
	 * @param a1: first value to compare.
	 * 
	 * @param a2: second value to compare.
	 * 
	 * @param a3: third value to compare.
	 */
	private static void findFloatMax(Float a1, Float a2, Float a3) {
		Float max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		System.out.println("Maximum value is " + max);

	}

	/*
	 * Method to compare three integer values and get the maximum value.
	 * 
	 * @param a1: first value to compare.
	 * 
	 * @param a2: second value to compare.
	 * 
	 * @param a3: third value to compare.
	 */
	private static void findIntMax(Integer a1, Integer a2, Integer a3) {
		Integer max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		System.out.println("Maximum value is " + max);
	}
}
