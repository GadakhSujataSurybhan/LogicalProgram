package practice;

public class Palindrrom_Study {

	public static void main(String[] args) {
		String name= "madam";
	    String reversedStr = ""; 
		
		for(int i=name.length()-1; i>=0; i--)
		{
			reversedStr=reversedStr +name.charAt(i);
			//System.out.println("palindrom string is "+palindromString);
			if(name.equals(reversedStr))
			{
				System.out.println("then it is palindrom string");
			}
			else
			{
				System.out.println(" it is not palindrom string");
			}
			
		}
		System.out.println("palindrom string is "+reversedStr);
	}
	

}
