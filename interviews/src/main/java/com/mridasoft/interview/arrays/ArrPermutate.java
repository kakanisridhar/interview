package com.mridasoft.interview.arrays;

import java.util.Arrays;

public class ArrPermutate {
	
	public static void permute(int[] arr){
	    permuteHelper(arr, 0);
	}

	private static void permuteHelper(int[] arr, int index){
	    
		if(index >= arr.length - 1){ 
	    	//If we are at the last element - nothing left to permute
	        System.out.println(Arrays.toString(arr));
	        
	        return;
	    }

	    for(int i = index; i < arr.length; i++){ 
	    	//For each index in the sub array arr[index...end]

	        //Swap the elements at indices index and i
	        int t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;

	        //Recurse on the sub array arr[index+1...end]
	        permuteHelper(arr, index+1);

	        //Swap the elements back - backtrack
	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}
	
	public static void main(String[] args) {
		
		permute(new int[] {1,2,3});
	}

}
