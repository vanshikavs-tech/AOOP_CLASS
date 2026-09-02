import java.sql.*;

public class MySQLConnectTest {

    public static void main(String[] args) {

        try {
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "Vani@9510"
            );

            System.out.println("Connection Successful");

            // Step 3: Insert data
            String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            // Step 4: Set values
            pst.setInt(1, 1);
            pst.setString(2, "Vanshika");
            pst.setInt(3, 95);

            // Step 5: Execute query
            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student inserted successfully!");
            }

            // Step 6: Close resources
            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
}