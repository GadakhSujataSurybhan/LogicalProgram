package LogicalProgram;

import java.util.Scanner;

public class PalindromStudy {

	public static void main(String[] args) {
		//Sujata
		
		Scanner scan= new Scanner(System.in);
		String OriginalString = scan.next();
		String reverseString= "";
		for(int i= OriginalString.length()-1; i>=0; i--)
		{
			reverseString=reverseString+OriginalString.charAt(i);
			
		}
		System.out.println("original string is "+OriginalString);
		System.out.println("reverse string is "+reverseString);
		if(OriginalString.equals(reverseString))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
