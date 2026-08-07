import java.util.Scanner; 

    void main() {
        Scanner scanner = new Scanner(System.in);
        
        IO.print("Enter a day of the week: ");
        String day = scanner.nextLine().toUpperCase(); 
        
        String dayType;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                dayType = "Weekday";
                break;
            case "SATURDAY":
            case "SUNDAY":
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid day";
                break;
        }
        
        IO.println(day + " is a " + dayType);
        
        scanner.close();
    }
