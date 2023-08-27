import java.util.Scanner;

class StringPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        printStringPyramid(input);
    }
    
    public static void printStringPyramid(String str) {
        int length = str.length();
        
        for (int i = 0; i < length; i++) {
            // Print spaces before the characters
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print("  ");
            }

            // Print characters up to the current index
            for (int k = 0; k <= i; k++) {
                System.out.print(str.charAt(k) + " ");
            }

            System.out.println();
        }
    }
}
