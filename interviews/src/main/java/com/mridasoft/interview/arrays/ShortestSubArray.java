package com.mridasoft.interview.arrays;

public class ShortestSubArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int shortest = ShortestSubArray.shortestSubArraySize(arr, 10);
		System.out.println(shortest);
	}

	//Not Efficient but understandable solution
	public static int shortestSubArraySize(int[] arr,int sum) {
		
		int shortest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>sum) return 1;
			
			int count = arr[i];
			
			for(int j=i ; j < arr.length ; j++) {
				count = count + arr[j];
				
				int subArrLength = j-i+1;
				
				if(subArrLength > shortest) {
					break;
				}
				
				if(count > sum) {
					shortest = j-i+1;
				}
			}
		}
		
		return shortest;
	}
}
