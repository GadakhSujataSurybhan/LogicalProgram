package LogicalProgram;

import java.util.Scanner;

public class TakeUserInput {

	public static void main(String[] args) {
		//Sujata-Input
		System.out.println("please enter number1 and number 2");
		Scanner scan = new Scanner(System.in);
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		int addition = num1+num2;
		
		System.out.println("the addition of num"+num1+ " and addition of num "+num2+ " is "+addition);

	}

}


