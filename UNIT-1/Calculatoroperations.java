import java.util.Scanner;
    void main() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;
		
        do {
            IO.println("\n--- Calculator Menu ---");
            IO.println("1. Addition (+)");
            IO.println("2. Subtraction (-)");
            IO.println("3. Multiplication (*)");
            IO.println("4. Division (/)");
            IO.println("5. Exit");
            IO.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                IO.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                IO.print("Enter the second number: ");
                num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        IO.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        IO.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        IO.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        // Special check to prevent division by zero errors
                        if (num2 != 0) {
                            result = num1 / num2;
                            IO.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } else {
                            IO.println("Error: Cannot divide by zero!");
                        }
                        break;
                }
            } 
            else if (choice == 5) {
                IO.println("Exiting the calculator. Goodbye!");
            } 
            else {
                IO.println("Invalid choice! Please select a valid option from the menu.");
            }

        } while (choice != 5); 

        scanner.close();
    }
