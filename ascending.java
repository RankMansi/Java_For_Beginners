import java.util.Arrays;
import java.util.Scanner;

class ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted elements in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
