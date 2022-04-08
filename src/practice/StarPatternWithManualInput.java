package practice;

import java.util.Scanner;

public class StarPatternWithManualInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("total no of rows is :-" );
	    int rows = scan.nextInt();
		
		
		System.out.println("total no of column is :-" );
		
		  int columns = scan.nextInt();
		  System.out.println("Enter number pattern to be printed :- ");
			 
			 Scanner sc1 = new Scanner(System.in);
			
				String pattern = sc1.next();
		
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=columns; j++)
			{
				System.out.print("  "+pattern);
			
			}
			System.out.println();
			
		}
	}
		
		
		
	}


