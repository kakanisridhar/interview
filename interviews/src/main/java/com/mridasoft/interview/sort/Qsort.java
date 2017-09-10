package com.mridasoft.interview.sort;

import java.util.Arrays;

public class Qsort  {
    private int[] numbers;
    private int number;

    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    //leftindex, rightindex
    private void quicksort(int low, int high) {
        
    	int i = low, j = high;
       
        //int pivot = numbers[low + (high-low)/2];

        int pivot = numbers[high];
        
        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    
    public static void main(String[] args) {
		
    	int arr[] = {10, 7, 35, 30, 18, 80, 55, 90, 40, 50, 35};
    	Qsort sorter = new Qsort();
    	sorter.sort(arr);
    	System.out.println(Arrays.toString(arr));
    	
	}
}