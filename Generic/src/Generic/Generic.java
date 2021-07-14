package Generic;

import java.util.Scanner;

public class Generic {
	public static void main(String[] args) {
		Integer x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		x = sc.nextInt();
		System.out.println("Enter the second number");
		y = sc.nextInt();
		System.out.println("Enter the third number");
		z = sc.nextInt();
		findMax(x, y, z);
		sc.close();

	}

	private static void findMax(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		System.out.println("Maximum value is " + max);
	}
}
