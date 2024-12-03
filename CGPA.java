import java.util.Scanner;

public class CGPA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter the number of courses: ");
        int numberOfCourses = scanner.nextInt();
        int totalCredits = 0;
        double totalMarks = 0;
        for (int i = 1; i <= numberOfCourses; i++) {
            System.out.println("Enter details for Course " + i + ":");
            System.out.print("Credit (Max 3): ");
            int credit = scanner.nextInt();
            System.out.print("CT (Max 30): ");
            int ctMarks = scanner.nextInt();
            System.out.print("AT (Max 10): ");
            int atMarks = scanner.nextInt();
            System.out.print("FE (Max 60): ");
            int feMarks = scanner.nextInt();
            int totalMarksForCourse = ctMarks + atMarks + feMarks;
            totalCredits += credit;
            totalMarks += totalMarksForCourse;
        }
        double cgpa = totalMarks / totalCredits;
        String grade = "";

        if (cgpa >= 9.0) {
            grade = "A+";
        } else if (cgpa >= 8.0) {
            grade = "A";
        } else if (cgpa >= 7.0) {
            grade = "B+";
        } else if (cgpa >= 6.0) {
            grade = "B";
        } else if (cgpa >= 5.0) {
            grade = "C+";
        } else if (cgpa >= 4.0) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalCredits);
        System.out.println("CGPA: " + String.format("%.2f", cgpa));
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
