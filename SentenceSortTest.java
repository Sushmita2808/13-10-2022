package com.test.bll;

import java.util.Scanner;

public class SentenceSortTest {
	
	public static void main(String[] args) {
		
		//Take a sentence as a user input. 
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a sentence : ");//
		
		String result = in.nextLine();
		
		String[] words = SentenceSort.SentenceIntoChar(result);//call SentenceIntoChar()
		
		String[] sw= SentenceSort.SortWord(words);//call SortWord()
		
		System.out.print("\nDisplay words : ");
		
		for(String s : sw)
			
			System.out.print(s);//display Sorting Word

		
		in.close();
	}
}
