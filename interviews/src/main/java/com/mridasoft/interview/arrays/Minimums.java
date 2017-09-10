package com.mridasoft.interview.arrays;

public class Minimums {
	
	public static void main(String[] args) {
		
		
		//System.out.println(firstMin(arr));
		System.out.println(secondMin(new int[] {0,1,2,3,4,5}));
		System.out.println(secondMin(new int[]{2,2,2,2,2}));
		
	}

	public static int firstMin(int[] arr) {
		int firstMin  = arr[0];
		int n =  arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i] < firstMin) {
				firstMin = arr[i];
			}
		}
		return firstMin;
	}
	
	public static Integer secondMin(int[] arr) {
		int firstMin  = arr[0];
		Integer secondMin = null;
		int n =  arr.length;
		for(int i=1;i<n;i++) {
			
			if(firstMin < arr[i] ) { //we found probable second min
				if(secondMin==null|| secondMin > arr[i])
					secondMin = arr[i];
			} else if(firstMin == arr[i]) { //same so no change in second min
				//
			} else { //we found new low 
				firstMin = arr[i];
			}
		}
		return secondMin;
	}
}
