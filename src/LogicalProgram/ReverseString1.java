package LogicalProgram;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		// Sujata 
		Scanner scan = new Scanner(System.in);
		String OrginalString = scan.next();
		String ReverseString = "";
		for(int i=OrginalString.length()-1; i>=0; i-- )
		{
			ReverseString=ReverseString +OrginalString.charAt(i);
			
		}
		System.out.println("Original string is "+OrginalString);
		System.out.println("Reverse Stirng is "+ReverseString);
	
	}

}
