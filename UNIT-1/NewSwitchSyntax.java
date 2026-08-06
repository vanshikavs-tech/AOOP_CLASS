import java.util.Scanner; 

    void main() {
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter a day of the week: ");
        String day = scanner.nextLine().toUpperCase(); 
        String dayType = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid day";
        };
        
        IO.println(day + " is a " + dayType);
        
        scanner.close(); 
    }