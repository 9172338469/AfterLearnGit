package statement_with_Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class statement {
    
	void insertStudent(){
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			Statement stmt= con.createStatement();
			stmt.executeUpdate("insert into man values('3', 'golya', 'pune')");
			System.out.println("Student inserted Successfully");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		} 
		finally {
			try{
			con.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		statement s=new statement();
		s.insertStudent();
	}
}
