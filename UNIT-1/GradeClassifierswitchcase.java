import java.util.Scanner;
    void main(){
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

                switch (score / 10) {
                    case 10:
                    case 9:
                        grade = 'A';
                        break;
                    case 8:
                        grade = 'B';
                        break;
                    case 7:
                        grade = 'C';
                        break;
                    case 6:
                        grade = 'D';
                        break;
                    default:
                        grade = 'F';
                        break;
                }

                IO.println("  Subject " + (j + 1) + ": Score = " + score + " | Grade = " + grade);
            }
        }

        scanner.close();
    }