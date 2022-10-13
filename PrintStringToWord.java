package com.test.bll;
import java.util.Scanner;
/*
 * 3.	Take a sentence as a user input. 
Break up the sentence into words.
Sort the words based on the length of the word - and print out.
Example: If user inputs the sentence: "Hi, welcome to this mentoring session", the output should be:
to
Hi,
this
welcome
session
mentoring


 */
public class PrintStringToWord
{
	
	    public static void main(String[] args) {
	    	
	    	//Take a sentence as a user input. 
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the String:");
	        
	        String str = sc.nextLine();
	      
	        
	        //split() splits this string against given regular expression and returns a char array.
	       String arr[] = str.split("\\s+");//for giving one or more spaces
	       
	       
	        for (int i = 1; i < arr.length-1; i++) {//Nested loop
	           
	        	int outer = arr[i].length();//outer loop
	            
	        	for (int j = i + 1; j < arr.length; j++) {
	               
	        		int inner = arr[j].length();//inner loop
	               
	        		if (outer > inner || outer == inner && arr[i].compareTo(arr[j]) > 0) {//comparing length,if condition true 
	        			
	        			//return Swapping
	                    String temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                    outer = inner; // outer has new length
	                    
	                }
	            }
	        }
	        
	        String result = " ";
	        for (String word : arr) {
	            result += word + "\n ";
	        }
	        System.out.println("\nDisplay String into words :"+"\n"+result);
	        sc.close();
        }
    }