package LogicalProgram;

public class Duplicatechar {

	public static void main(String[] args) {
		String str = "abcdeabcd";
		char a[]= str.toCharArray();
		int len = a.length;
		
		for (int i = 0; i < len; i++) {
			int count=1;
			
			for (int j = i+1; j < len; j++) {
				
				if(a[i]==a[j] && a[i] != ' ') {
					count++;
					a[j]='0';
				}
			}
			
			   if(count > 1 && a[i] != '0')  
	                System.out.println(a[i]);  
	        }  
		}

	}


