package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement_pro {
  
	void insertStudent(){
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			PreparedStatement pstmt= con.prepareStatement("insert into student values(?,?,?)");
			pstmt.setInt(1, 17);
			pstmt.setString(2, "Dhanaji");
			pstmt.setString(3, "933747587");
			
			pstmt.setInt(1, 14);
			pstmt.setString(2, "Tanaji");
			pstmt.setString(3, "939266772");
			                      
			pstmt.executeUpdate();
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
		PreparedStatement_pro pst=new PreparedStatement_pro();
		pst.insertStudent();
		
	}
}
