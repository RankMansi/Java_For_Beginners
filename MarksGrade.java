import java.util.*;

class MarksGrade{
	
	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		int marks, marks1, marks2, marks3, marks4, marks5;

		System.out.print("Discrete Maths:  ");
		marks1 = scan.nextInt();
		grade(marks1);

		System.out.print("DECO:  ");
		marks2 = scan.nextInt();
		grade(marks2);

		System.out.print("MPI:  ");
		marks3 = scan.nextInt();
		grade(marks3);

		System.out.print("Java:  ");
		marks4 = scan.nextInt();
		grade(marks4);

		System.out.print("Data Structures:  ");
		marks5 = scan.nextInt();
		grade(marks5);
	}
	static void grade(int marks){

		if(marks>=80){
			System.out.println("O Grade");
		}
		else if(marks<80 && marks>=70){
			System.out.println("A+ Grade");
		}
		else if(marks<70 && marks>=60){
			System.out.println("A Grade");
		}
		else if(marks<60 && marks>=50){
			System.out.println("B+ Grade");
		}
		else if(marks<50 && marks>=40){
			System.out.println("B Grade");
		}
		else if(marks<40 && marks>=33){
			System.out.println("C Grade");
		}
		else{
			System.out.println("Sorry...! You need to try again.");
		}
	}
}