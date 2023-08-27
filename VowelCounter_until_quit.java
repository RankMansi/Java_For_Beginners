import java.util.*;

class VowelCounter_until_quit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String input = scan.nextLine().toLowerCase();

            if (input.equals("quit")) {
                break;
            }

            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
            
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == 'a') {
                    countA++;
                    totalA++;
                } else if (ch == 'e') {
                    countE++;
                    totalE++;
                } else if (ch == 'i') {
                    countI++;
                    totalI++;
                } else if (ch == 'o') {
                    countO++;
                    totalO++;
                } else if (ch == 'u') {
                    countU++;
                    totalU++;
                }
            }

            System.out.println("Vowel Counts - A: " + countA + ", E: " + countE + ", I: " + countI + ", O: " + countO + ", U: " + countU);
        }

        System.out.println("Total Vowel Counts - A: " + totalA + ", E: " + totalE + ", I: " + totalI + ", O: " + totalO + ", U: " + totalU);
    }
}
