package practice;

import java.util.Scanner;

public class CountUpperLowercase {

	public static void main(String[] args) {
		String str="Sujata";
		int upper=0; int lower=0;
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter the string");
//		str = scan.nextLine();
		for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(ch>='A'&& ch<'Z') {
			upper++;
		
		}
		else if(ch>='a'&& ch<'z') {
			lower++;
		}	
		}
		System.out.println("the upper case letter is " +upper);
		System.out.println("the lower case letter is " +lower);
	}

	}


