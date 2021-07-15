package Generic;

public class Generic {
	public static void main(String[] args) {
		Integer x1 = 3, x2 = 5, x3 = 9;
		maximum(x1,x2,x3);
		Float y1 = 6.3f, y2 = 9.9f, y3 = 5.0f;
		maximum(y1,y2,y3);
		String z1 = "Apple", z2 = "Mango", z3 = "Peach";
		maximum(z1,z2,z3);
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