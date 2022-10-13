package com.test.bll;
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
public class SentenceSort {
	
	public static String[] SentenceIntoChar(String sentence) {
		// splits this string against given regular expression and returns a char array.
		int c_space = 0;
		
	    int index = 0;
	    
	    char[] charArr = sentence.toCharArray();//change char into array

	    for (int i = 0; i < charArr.length; i++) 
	    	
	        if (charArr[i] == ' ') //char is empty
	        	
	        	c_space++;//space increment 
	    
	    String[] words = new String[c_space + 1];//space move only one step
	    
	    String temp = "\n";//newline
	    
	    for (int i = 0; i <charArr.length; i++) {
	    	
	        if (charArr[i] != ' ') {//char is not empty
	        	
	        	temp += charArr[i];//condtion true
	        	
	        } else {
	        	
	        	words[index++] = temp;//condtion false
	        	
	            temp = "\n";//newline
	        }
	    }
	    words[index] = temp;//value stored in temp
	
		return words;
	}
	
	//Sorting word and swapping
	public static String[] SortWord(String[] wordArr) {
		
		for(int i = 0; i < wordArr.length; i++) {//nested loop
			
			for(int j=i; j < wordArr.length; j++) {
				
				if(wordArr[i].length() > wordArr[j].length()){//comparing length
					
					
					String temp = wordArr[j];
					wordArr[j] = wordArr[i];
					wordArr[i]= temp;       //word stored in temp
					
				}
			}
		}//outer loop
		
		return wordArr;
		
	}
}

