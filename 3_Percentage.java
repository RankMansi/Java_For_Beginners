import java.util.*;

class Percentage{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int Subjects = 6;
        String[] subjectNames = {"Java Programming", "Discrete Maths", "Data Structures", "MPI", "DECO", "Open_Elective"};
        int[] marks = new int[Subjects];

        // Input marks for each subject
        for (int i = 0; i < Subjects; i++) {
            System.out.print("Enter marks for " + subjectNames[i] + ": ");
            marks[i] = scan.nextInt();
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate percentage
        double percentage = (double) totalMarks / (Subjects * 100) * 100;

        System.out.println("\n\nSubject-wise Marks:\n\n");
        for (int i = 0; i < Subjects; i++) {
            System.out.println(subjectNames[i] + ": " + marks[i]);
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
