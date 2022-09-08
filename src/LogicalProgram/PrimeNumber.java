package LogicalProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=7;
		int counter=0;
		
for(int i=2; i<7; i++)
{
	if(num%i==0)
	{
		counter++;
		break;	
	}
}	
	if(counter==1)
	{
		System.out.println("given number is not prime number");
	}
	else {
		System.out.println("given number is prime number");
	}
	
	

	}

}
