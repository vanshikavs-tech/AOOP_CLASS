import java.util.Scanner;

    void main() {
		
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter the number of students: ");
		
        int numStudents = scanner.nextInt();
        IO.print("Enter the number of subjects per student: ");
		
        int numSubjects = scanner.nextInt();
        int[][] studentScores = new int[numStudents][numSubjects];
		
        for (int i = 0; i < numStudents; i++) {
            IO.println("\n--- Entering scores for Student " + (i + 1) + " ---");
            for (int j = 0; j < numSubjects; j++) {
                IO.print("Enter score for Subject " + (j + 1) + " (0-100): ");
                studentScores[i][j] = scanner.nextInt();
            }
        }
		
        for (int i = 0; i < studentScores.length; i++) {
            IO.println("\nStudent " + (i + 1) + " Grades:");

            for (int j = 0; j < studentScores[i].length; j++) {
                int score = studentScores[i][j];
                char grade;
                if (score >= 90) {
                    grade = 'A';
                } else {
                    if (score >= 80) {
                        grade = 'B';
                    } else {
                        if (score >= 70) {
                            grade = 'C';
                        } else {
                            if (score >= 60) {
                                grade = 'D';
                            } else {
                                grade = 'F';
                            }
                        }
                    }
                }

                IO.println("  Subject " + (j + 1) + ": Score = " + score + " | Grade = " + grade);
            }
        }

        scanner.close();
    }