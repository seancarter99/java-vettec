package com.skillstorm.week13.day4;

public class Example {
	
	int x = 10;

	public static float parseFloat(String s){
		   float f = 0.0f;
		   try{
		      f = Float.valueOf(s).floatValue();
		      
		   }
		   catch(NumberFormatException nfe){
		      System.out.println("Invalid input " + s);
		      f = Float.NaN ;
		      return 2.0f;
		   }
		   finally { System.out.println("finally");  return -1.0f ;}
		}
	
	public static void main(String[] args) {
		System.out.println(parseFloat("asdfadsf"));
		Example example = new Example();
		System.out.println(example.x);
		
		Object o = new String();
		
		boolean bool = false;
		
		if (bool) System.out.println(true);
		else { 
			System.out.println(false); 
		}
		System.out.println(true);
	}
}
