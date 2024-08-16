import java.util.Scanner;

public class IT24100258Lab4Q3 {
	public static void main(String[] args){
		//defining a variable for the number and create a scanner object.
		double num;
			
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Enter a number: ");
		num = scanner.nextDouble();
		
		//printing if the inserted number is positive,negative or zero.	
		String message = (num > 0) ? "The number is: Positive" :
				  	(num < 0) ? "The number is: Negative" :
				  	"The number is Zero.";
			
		System.out.println(message);
	}
}