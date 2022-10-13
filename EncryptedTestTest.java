package com.test.pll;

import com.test.bll.EncryptedText;

/*
 * 1.	 A class to encode texts Specification: Realize a Java class to represent encrypted texts. 
 * 		The encryption of the text is obtained by replacing each character 
 * 		with the character whose code is equal to the code of the character to encode 
 * 		augmented by an integer number representing the encryption key. 
 */
public class EncryptedTestTest {
	
	public static void main(String[] args) {
		
		//created object that represents a text encrypted 
		EncryptedText e = new EncryptedText("@12Sushmita&", 10);
		
		System.out.println("\n--------Secret  Data-------\n");
		//Don't share your password
		System.out.println("\nPassword \n");
		
		System.out.println("\nENCODE : "+e.getEncryptedText());//encrypted data
		System.out.println("\nDECODE :"+e.getDecryptedText(10));//decrypted data
		
	}

}
/*
*/