package com.mridasoft.interview.arrays;

import java.util.Arrays;

public class Rotate {
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,4};
		
		for(int i = 0; i < 10; i++ ) {
			int[] clone = arr.clone();
			System.out.println(i);
			System.out.println(Arrays.toString(rotateLeft(clone, i)));
			System.out.println("**********");
		}
		
	}
	
	public static int[] rotateLeft(int[] arr, int by) {
	    
		if (arr == null || by < 0) {
			return arr;
	    }
	    
	    int shifts = by % arr.length;
	    
	    if(shifts > 0) {
	    	
		    int[] copy = arr.clone();
		    
		    int j = 0;
		    for(int i = shifts ; i < arr.length ; i++) {
		    	copy[j++] = arr[i]; 
		    }
		    
		    for(int i = 0; i < shifts ; i++) {
		    	copy[j++] = arr[i]; 
		    }
	    }
	    
	    return arr;
	}


}
