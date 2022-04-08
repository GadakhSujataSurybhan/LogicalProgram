package practice;

public class starPattern1 {

	public static void main(String[] args) {
	
		
		for(int col=0; col<=5; col++)
		{
			for(int row=0; row<=5; row++)
			{
				if(col>row)
				{
					System.out.print(" * ");
				}
				
				
			}
			System.out.println();
		}

	}

}
