package com.test.bll;
/*
 * 2.	Write a method reverse() that receives a string str as a parameter 
 * and returns the characters in str in reverse order. Thus, if the value 
 * sent to reverse() is "I me ", the method returns " em I".
 */

public class StringRev {

	public static String reverse(String str) {
	    
		char ch[] = str.toCharArray();//change char to array 
		
	    String rev = " "; 
	    
	    for(int i=ch.length-1;i>=0;i--){  
	    	
	        rev+=ch[i];//add character in rev  
	    }  
	    
	    return rev;  
	}  
		
	    public static void main(String[] args){
	    	
	        String string = " I me ";
	        
	        String rev = reverse(string);//call reverse()
	        
	        System.out.println("\nOriginal sentence : " + string);//original sentence
	        
	        System.out.println("\nReversed sentence : " + rev);//reverse sentence
	  }

	    
}
