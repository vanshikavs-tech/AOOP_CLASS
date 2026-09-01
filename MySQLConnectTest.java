import java.sql.*;
public class MySQLConnectTest{
	public static void main("com.mysql.cj.jdbc.Driver");
	public static void main(String[]args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getconnection(
			"jdbc:mysql://localhost:3306/college","root","Vani@9510");
			System.out.println("Connection Successfull");
			con.close();
		}catch(Exception e){
			System.out.println("Connection failed");
			e.printStackTrace();
			
		}
	}