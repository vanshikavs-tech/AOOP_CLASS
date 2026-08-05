 void main() {
	 
    int[][] studentScores = {
		{85, 92, 78}, 
        {59, 65, 71},  
	    {98, 89, 95}   
        };
        for (int i = 0; i < studentScores.length; i++) {
            IO.println("Student " + (i + 1) + " Grades:");    
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
    }