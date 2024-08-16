import java.util.Scanner;

public class IT24100258Lab4Q2{
	public static void main(String[] args){
		//defining variables for exam marks, lab marks, exam precentages, and final marks.
		double exam_marks, lab_marks, ex_prec, lab_prec, final_marks;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100):  ");
		exam_marks = scanner.nextDouble();

		//validate inputs and calculate final marks.
		if(exam_marks >= 0 && exam_marks <= 100){
			System.out.print("Please enter lab submission marks (out of 100):  ");
			lab_marks = scanner.nextDouble();

			if(lab_marks >= 0 && lab_marks <= 100){
				System.out.print("Please enter the precentage given for the exam:  ");
				ex_prec = scanner.nextDouble();

				System.out.print("Please enter the precentage given for the lab submission:  ");
				lab_prec = scanner.nextDouble();

				double total_prec = ex_prec + lab_prec;

				if(total_prec > 100 || total_prec < 100){
					System.out.print("The precentages must be add up to 100. Terminating program");	
					System.exit(0);
				}else{
					final_marks = exam_marks * (ex_prec/100) + lab_marks * (lab_prec/100);
					System.out.println();
					System.out.println("Final Exam Mark is : " + final_marks);
				}
	
			}
		}else{
			System.out.print("Invalid input for exam marks. Terminating program.");
			System.exit(0);
		}
		
	}
}