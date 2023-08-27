import java.util.*;

class Maximum_Numbers{
	
	public static void main(String args[]){

			Scanner scan = new Scanner(System.in);
			float num1, num2, num3;
			float max;

			System.out.println("Enter the number 1: ");
			num1 = scan.nextFloat();
			System.out.println("Enter the number 2: ");
			num2 = scan.nextFloat();
			System.out.println("Enter the number 3: ");
			num3 = scan.nextFloat();

			max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
			
			System.out.println("Maximum number among " + num1 + ", " + num2 + " and " + num3 + " is " + max);
	}
}