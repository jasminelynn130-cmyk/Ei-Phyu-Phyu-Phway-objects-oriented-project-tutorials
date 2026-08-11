import java.util.Scanner;

public class StudentGrade {
    private final String studentName;
    private final double[] scores;

    public StudentGrade(String studentName, double[] scores) {
        this.studentName = studentName;
        this.scores = scores;
    }

    public double getAverage() {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }

    public String getLetterGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public void displayReport() {
        System.out.println("Student Name: " + studentName);
        System.out.printf("Average Score: %.2f%n", getAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("How many subjects? ");
            int count = input.nextInt();

            double[] scores = new double[count];
            for (int i = 0; i < count; i++) {
                System.out.print("Enter score " + (i + 1) + ": ");
                scores[i] = input.nextDouble();
            }

            StudentGrade student = new StudentGrade(name, scores);
            student.displayReport();
        }
    }
}