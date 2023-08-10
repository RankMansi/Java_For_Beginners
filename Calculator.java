import java.util.*;

class Calculator{
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int number;
		float number1, number2, sum, diff, mul, div, mod;

		System.out.println("Enter the number for the following operations to be performed : 1. Addition 2.Subtraction 3. Multiplication 4.Division 5.Modulo");
		number = scan.nextInt();
		System.out.println("Enter number 1: ");
		number1 = scan.nextFloat();
		System.out.println("Enter number 2: ");
		number2 = scan.nextFloat();

		switch(number){

			case 1:
				sum = number1 + number2;
				System.out.println("The Sum is : " + sum);
				break;
			case 2:
				diff = number1 - number2;
				System.out.println("The Difference is : " + diff);
				break;
			case 3:
				mul = number1 * number2;
				System.out.println("The Multiplication is : " + mul);
				break;
			case 4:
				div = number1 / number2;
				System.out.println("The Division is : " + div);
				break;
			case 5:
				if(number1 >= number2){
					mod = number1 % number2;
					System.out.println("The Modulo is : " + mod);
				}
				else{
					System.out.println("Wrong input...! Please try again..!");
				}
				break;
		}
	}
}