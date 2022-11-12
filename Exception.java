package examples;
import java.util.Scanner;

public class ExceptionHandling {

	
	

	

	public static void main(String[]  args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter te no1");
		int no1=sc.nextInt();
		System.out.println("Enter the no2");
		int no2=sc.nextInt();
		//arithmetic exception
	

try {
		int result=no1/no2;//throw
		System.out.println("RESULT  "+result);
	
//throw
	

		
		}
		catch(  ArithmeticException   e) {
			System.err.println("Error Occurred");
			throw e;
		}
		finally {
	
		System.out.println("Exception handling");
	}
}
}

	
	

