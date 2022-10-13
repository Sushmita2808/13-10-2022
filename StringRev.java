package com.test.bll;
/*
 * 2.	Write a method reverse() that receives a string str as a parameter 
 * and returns the characters in str in reverse order. Thus, if the value 
 * sent to reverse() is "I me ", the method returns " em I".
 */

public class StringRev {

	public static String reverse(String s) {
	    
		// the index of the whitespaces
	    int x = s.indexOf(" ");
	    
	    if(x == -1)//candition is for base
	    	
	      return s;
	      
	    //Recursive call
	    return reverse(s.substring(x+1)) +" "+ s.substring(0, x);
	    
	     }
		
	    public static void main(String[] args){
	    	
	        String string = "My name is Sushmita Kumari";
	        String rev = reverse(string);//call reverse()
	        System.out.println("\nReversed sentence : " + rev);
	  }

	    
}
