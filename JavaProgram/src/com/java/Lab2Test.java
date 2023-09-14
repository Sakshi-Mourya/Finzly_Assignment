package com.java;

class Lab2 {
    byte b;     // variable & constants demo 
    short s;    // 0
    int i;      // 0 
    long l;     // 0 
    float f;    //0.0
    double d;   // 0.0
    char ch;    // for 1 character’s blankspace
    boolean b1; //  false
   void show1() {
    System.out.println("variables & constants demo");
    System.out.println(b); 
    System.out.println(d); 
    System.out.println(s); 
    System.out.println(ch); 
    System.out.println(i); 
    System.out.println(b1); 
    System.out.println(l); 
    System.out.println(f); 
    System.out.println(f);
    // System.out.println (x);x cannot resolved to a variable
    // x=x+1
   }
   void show2() {
    System.out.println("integer literal demo"); 
    int a = 12;
    int b = 10;
    int c = 0x12a; // integer literal demo 
    Byte d = 012; 
    System.out.println(a); // 12
    System.out.println(b); // 10
    System.out.println(c); // 298
    System.out.println(d); // 10
   }
   void show3() {
    System.out.println("floating point literal demo");
    float f1 = 99.97f;
    double d1 = 9.9e-9; 
    double d2 = 9.9E+9;
    System.out.println(f1); // 99.97 
    System.out.println(d1); // 9.9E-9 
    System.out.println(d2); // 9.9E9
   }
   void show4() {
    System.out.println("character literal demo");
    char ch1 = 'A'; 
    int x1 = 'A';
     // char ch2 = ''; // error invalid character constant
     //int x2 = '' ;   // error 
    char ch3 = 'I';
    int x3 = 'I'; 
    System.out.println(ch1); // A 
    System.out.println(x1);  //65
     // System.out.println (ch2); // error +
     // System.out.println (x2);  // error + 
     System.out.println(ch3);     // I 
    System.out.println(x3);       // 73
   }
   void show5() {
    System.out.println("Boolean literal demo"); 
    boolean bb1 = false;
    boolean bb2 = true; 
    System.out.println(bb1); // false 
    System.out.println(bb2); // true
   }
   void show6() {
    System.out.println("string literal demo");
    String ste1 = "";
    String ste2 = "123 abc+"; 
    String ste3 = "1";
    System.out.println("ste1 " + ste1);   // ste1- - "blank" 
    System.out.println(ste1.length());
    System.out.println("ste2 = " + ste2); // ste2=123 abc +
    System.out.println(ste2.length());    // 9 
    System.out.println("ste3="	+ ste3);  // ste = 1
    System.out.println(ste3.length());    // 1
   }  
}
public class Lab2Test {

	 public static void main(String[] args){
	     Lab2 h = new Lab2(); 
	     h.show1();
	     h.show2();
	     h.show3();
	     h.show4();
	     h.show5();
	     h.show6();
	   }
}
