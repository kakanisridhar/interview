package com.mridasoft.interview.arrays;

public class Maximums {

	//Find index of maximum element
	public static int findMax(int arr[]) {
		int index = 0;
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
				index = i;
			}
		}
		return index;
	}
	
}
