package com.coforge.jay;

import java.util.Arrays;

public class Seregate0and1 {

	public static void main(String[] args) {
		
		int[] arrange0and1 = arrange0and1(new int[] {1,0,1,0,1,0,1,1,});
		System.out.println(Arrays.toString(arrange0and1));

	}

	public static int[] arrange0and1(int[] arr) {
		int length = arr.length;
		int count = 0;
		
		for(int i=0;i<length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		
		for(int i=count;i<length;i++) {
			arr[i]=1;
		}
		return arr;
		
	}

}
