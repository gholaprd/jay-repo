package com.coforge.jay;

public class MissingNumber {
	
	public static int findMissingNumber(int[] arr) {
		int length = arr.length;
		int total = (length+1)*(length+2)/2;
		
		for(int i=0;i<length;i++) {
			total = total-arr[i];
		}
		return total;		
	}

	public static void main(String[] args) {
		int findMissingNumber = findMissingNumber(new int[] {1,2,3,4,5,6,8,9,10});
		System.out.println(findMissingNumber);
	}

}
