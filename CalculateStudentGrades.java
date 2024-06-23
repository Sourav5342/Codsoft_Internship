// Task 2: Student Grade Calculator
import java.util.Scanner;
public class CalculateStudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in English: ");
        int englishMarks = sc.nextInt();
        System.out.print("Enter marks in Physics: ");
        int physicsMarks = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistryMarks = sc.nextInt();
        System.out.print("Enter marks in Math: ");
        int mathMarks = sc.nextInt();
        int totalMarks=physicsMarks+ englishMarks+ chemistryMarks+ mathMarks;
        double averagePercentage = totalMarks / 4.0;
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
