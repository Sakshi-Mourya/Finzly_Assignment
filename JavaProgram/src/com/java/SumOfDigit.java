package com.java;

public class SumOfDigit {
	public static void main(String[] args){
		
	    int n = 123;
	    // int n=Integer.parseInt(args [0]); 
	    
	    int sum = 0;
	    while (n != 0) { 
	      int r = n % 10; 
	      sum += r;
	      n = n / 10;
	    }
	    System.out.println("Sum = " + sum);
	   }

}
