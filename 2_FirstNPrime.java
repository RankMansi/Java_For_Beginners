import java.util.*;

class FirstNPrime{
	
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		System.out.print("First " + number + " prime numbers: ");
        int count = 0;
        int num = 2;

        while (count < number) {
            boolean isPrime = true;
            for (int i=2 ; i*i<=num ; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
		}
	}
}