package LogicalProgram;

import java.util.Scanner;

public class NumberOfWhiteSpaceinString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Suj  a  ta
		String name = "su  jat   a";
		 int space =0;
		 
		 for(int i=0; i<name.length()-1; i++)
		 {
			 char mychar = name.charAt(i);
			if(mychar==' ')
			 {
				 space++;
			 }
			 
		 }
		 System.out.println("number of space is "+ space);
	}

}
