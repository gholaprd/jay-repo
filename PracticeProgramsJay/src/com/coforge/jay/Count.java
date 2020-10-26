package com.coforge.jay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,1,1,2};
		List<Integer>list=Arrays.stream(a).boxed().collect(Collectors.toList());
		int count = (int) list.stream().filter(i->i==1).count();
		System.out.println(count);
		

	}

}

//Java program to find the smallest
//number whose sum of digits is also N
class GFG{

	static void findSmallest(int n) 
    { 
        int i, j=0; 
        int MAX = 50; 
        // To sore digits of result in reverse order 
        int[] res = new int[MAX];  
   
        // Case 1: If number is smaller than 10 
        if (n < 10) 
        { 
            System.out.println(n+10); 
            return; 
        } 
   
        // Case 2: Start with 9 and try every possible digit 
        for (i=9; i>1; i--) 
        { 
            // If current digit divides n, then store all 
            // occurrences of current digit in res 
            while (n%i == 0) 
            { 
                n = n/i; 
                res[j] = i; 
                j++; 
            } 
        } 
   
        // If n could not be broken in form of digits (prime factors of n 
        // are greater than 9) 
        if (n > 10) 
        { 
            System.out.println("Not possible"); 
            return; 
        } 
   
        // Print the result array in reverse order 
        for (i=j-1; i>=0; i--) 
            System.out.print(res[i]); 
        System.out.println(); 
    } 
	
	public static int getVal(int val) {
	    val = Math.abs(val);
	    int ninecount =  val / 9;
	    int remainder = val % 9;
	    int scale = (int)Math.pow(10, ninecount);
	    int result = remainder * scale + (scale - 1);
	    return result;
	}

//Driver code
public static void main(String[] args)
{
	int N = 14;
	getVal(N);
	findSmallest(N);
}
}

//This code is contributed 
//by shivanisinghss2110

