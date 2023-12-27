import java.util.Scanner;

public class GradeCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int toatalNumOfSubjects = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= toatalNumOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / toatalNumOfSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 55) {
            grade = 'D';
        } else if (averagePercentage >= 35) {
            grade = 'E';
        } else   {
            grade = 'F';
        

        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}