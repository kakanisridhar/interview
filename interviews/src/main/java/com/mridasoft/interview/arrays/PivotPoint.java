package com.mridasoft.interview.arrays;

public class PivotPoint {
	
	
	public static void main(String[] args) {
		
		PivotPoint.findPivot(new int[] {1,2,3,4,6,9} );
		
		PivotPoint.findPivot(new int[] {5, 9, 1, 2, 4});
	}

	public static void findPivot(int[] array) {
		
		int last = array[array.length - 1];
		int r;
		for (r = 0; array[r] >= last; ++r) ;
		int pivot = array[r];
		System.out.println(pivot);
	}
}
