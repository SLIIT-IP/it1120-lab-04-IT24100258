import java.util.Scanner;

public class IT24100258Lab4Q1 {

	public static void main(String[] args) {
		//defining a variable for the number and create a scanner object.
		double num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = scanner.nextDouble();
		
		//printing if the inserted number is positive,negative or zero.
		if(num > 0) {
			System.out.println("The number is: Positive");
		}else if(num < 0) {
			System.out.println("The number is: Negative");
		}else {
			System.out.println("The number is Zero.");
		}
	}

}
