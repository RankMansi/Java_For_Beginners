import java.util.*;

class Prime{

	public static void main(String args[]){

		int flag=0;
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for(int i=2; i<number; i++){
			if(number%i==0){
				flag=1;
			}
		}
		if(flag == 1){
			System.out.println(number + " is not a prime number");
		}		
		else{
			System.out.println(number + " is a prime number");
		}
	}
}