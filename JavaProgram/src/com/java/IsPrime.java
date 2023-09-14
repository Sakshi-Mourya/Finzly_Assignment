package com.java;

public class IsPrime {

	static Boolean isPrime(int n) { 
		  int count = 0;
		  for (int i = 2; i <= n / 2; i++) { 
		     if (n % i == 0) {
		       count++;
		       break;
		    }
		  }
		  if (count == 0) { 
		     return true;
		  } else {
		     return false;
		  }
		}
		public static void main(String[] args) { 
		  int m = 3;
		  int n = 30;
		  for (int i = m; i <= n; i++) { 
		    boolean b = isPrime(i); 
		    if(b){
		      System.out.println(i);
		    }
		  }
		 }
}
