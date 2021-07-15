package Generic;

import java.util.Scanner;

public class Generic {
	public static void main(String[] args) {
		Integer x1, x2, x3;
		Float y1, y2, y3;
		String z1, z2, z3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integer numbers");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		x3 = sc.nextInt();
		maximum(x1, x2, x3);
		System.out.println("Enter 3 float numbers");
		y1 = sc.nextFloat();
		y2 = sc.nextFloat();
		y3 = sc.nextFloat();
		maximum(y1, y2, y3);
		System.out.println("Enter 3 Strings");
		z1 = sc.next();
		z2 = sc.next();
		z3 = sc.next();
		maximum(z1, z2, z3);
		sc.close();
	}

	/*
	 * Generic Method to compare 3 values and get the maximum value.
	 * 
	 * @param a: first value to compare.
	 * 
	 * @param b: second value to compare.
	 * 
	 * @param c: third value to compare.
	 */
	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		printMax(a, b, c, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Maximum of %s %s & %s is %s \n", x, y, z, max);
	}
}