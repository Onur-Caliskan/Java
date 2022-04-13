import java.io.*;
import java.io.File;
import java.util.Scanner;


public class Decryption {
	

	//Ceaser cyphering question 


	public static void Decrypt(String text,int shift) {
		
		char c;
		
		String decrypt= "";
		
		
		for(int i = 0; i <text.length(); i++) {
			
			c =text.charAt(i);
			
			if(c >= 'a' && c<='z') {
				
				c = (char)(c-shift);
				
				if(c<'a') {
					
					c = (char)(c+'z'-'a'+1);	
				}
				decrypt += c;
				
			}
			
			
			System.out.println("Deciphered message is :" +decrypt);
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		//Decryption question
		File file =new File("C:\\Users\\Onur\\Documents\\Cipher.txt"); 
		
		Scanner scanner = new Scanner(file);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your shift value: ");
		
		int shift = scan.nextInt();
		
		System.out.println(" ");
		
		System.out.println("The deciphered messages are: ");
		
		while (scanner.hasNextLine()) {
						
			Decrypt(scanner.nextLine(), shift);
			
		}
		
		
		
		
	}
	


}
