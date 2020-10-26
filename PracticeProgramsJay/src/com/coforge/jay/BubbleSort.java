package com.coforge.jay;

import java.util.Arrays;

public class BubbleSort {

	public static void bubblesort(int[] arr) {

		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 2, 0, -2, 3, 3, 1 };
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
