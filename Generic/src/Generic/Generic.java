package Generic;

import java.util.Scanner;

public class Generic<T extends Comparable<T>>{
	T x1,x2,x3;
	public Generic(T x1, T x2, T x3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
	}
	public static void main(String[] args) {
		Integer x1, x2, x3;
		Float y1, y2, y3;
		String z1, z2, z3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integer numbers");
		// getting 3 integer values from user
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		x3 = sc.nextInt();
		maximum(x1, x2, x3);
		System.out.println("Enter 3 float numbers");
		//getting 3 floats values from user
		y1 = sc.nextFloat();
		y2 = sc.nextFloat();
		y3 = sc.nextFloat();
		maximum(y1, y2, y3);
		System.out.println("Enter 3 Strings");
		//getting 3 String values from user
		z1 = sc.next();
		z2 = sc.next();
		z3 = sc.next();
		maximum(z1, z2, z3);
		sc.close();
	}

	/*
	 * Generic Method to compare 3 values and get the maximum value.
	 * 
	 * @param x1: first value to compare.
	 * 
	 * @param x2: second value to compare.
	 * 
	 * @param x3: third value to compare.
	 */
	public static <T extends Comparable<T>> T maximum(T x1, T x2, T x3) {
		T max = x1;
		if (x2.compareTo(max) > 0)
			max = x2;
		if (x3.compareTo(max) > 0)
			max = x3;
		printMax(x1, x2, x3, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Maximum of %s %s & %s is %s \n", x, y, z, max);
	}
}