import java.util.*;
import java.util.Arrays;

class Array_Operations{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int length;
		System.out.println("Enter the length of the array for the operations");
		length = scan.nextInt();

		int[] arr = new int[length];
		int i;

		System.out.println("Enter the elements of the array for the operations");
		for(i=0 ; i<length ; i++){
			arr[i] = scan.nextInt();
		}

		int sum = 0;
		for(i=0 ; i<length ; i++){
			sum = sum + arr[i];
		}
		System.out.println("The Sum of the elements of the array is " + sum);

		int product = 1;
		for(i=0 ; i<length ; i++){
			product = product*arr[i];
		}
		System.out.println("The Product of the elements of the array is " + product);

		for(i=0 ; i<length ; i++){
			if(arr[i] % 15 == 0){
				System.out.println("The number divisible by 15 is : " + arr[i]);
			}
		}
		
		Arrays.sort(arr);
		System.out.println("The Sorted Array is: " + Arrays.toString(arr));
		
		System.out.println("The minimum element of th array is : " + arr[0]);
		System.out.println("The minimum element of th array is : " + arr[length-1]);
		
	}
}