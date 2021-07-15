package Generic;

import java.util.Arrays;

public class Generic<T extends Comparable<T>> {
	T[] elements;

	public Generic(T[] elements) {
		this.elements = elements;
	}

	public static void main(String[] args) {
		Integer[] integerMax = { 5, 90, 555, 26, 55 };
		Float[] floatMax = { 3.5f, 9.7f, 11.9f, 18.6f, 2.0f };
		String[] stringMax = { "Apple", "Strawberry", "Peach", "Banana", "Orange" };
		System.out.println("Maximum value " + maximum(integerMax));
		System.out.println("Maximum value " + maximum(floatMax));
		System.out.println("Maximum value " + maximum(stringMax));
	}

	/*
	 * Generic Method to get maximum value using array sort.
	 * 
	 * @param elements.
	 * 
	 */
	public static <T extends Comparable<T>> T maximum(T[] elements) {
		Arrays.sort(elements);
		T maximum = elements[(elements.length) - 1];
		return maximum;

	}

}