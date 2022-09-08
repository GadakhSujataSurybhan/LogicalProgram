package LogicalProgram;

public class ReverseNumberUsingSting {

	public static void main(String[] args) {
	///12345
		int num=12345;
		String orginalnum = Integer.toString(num);
		String revnum="";
		System.out.println("original number is "+num);
		for(int i= orginalnum.length()-1; i>=0; i--)
		{
			revnum=revnum+orginalnum.charAt(i);
			
		}
		int myrevnum = Integer.parseInt(revnum);
		System.out.println("Reverse number is "+myrevnum);

	}

}
