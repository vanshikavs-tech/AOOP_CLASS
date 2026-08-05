 void main() {
	 
     int[][] studentScores = {
		 
         {85, 92, 78},  
         {59, 65, 71},  
         {98, 89, 95}   
        };
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Student " + (i + 1) + " Grades:");
              for (int j = 0; j < studentScores[i].length; j++) {
                int score = studentScores[i][j];
                char grade;
                if (score >= 90 && score <= 100) {
                    grade = 'A';
                } else if (score >= 80 && score < 90) {
                    grade = 'B';
                } else if (score >= 70 && score < 80) {
                    grade = 'C';
                } else if (score >= 60 && score < 70) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                IO.println("  Subject " + (j + 1) + ": Score = " + score + " | Grade = " + grade);
            }
        }
    }