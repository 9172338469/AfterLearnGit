package UpdateValueByPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AddMultipleDataByPreparedstatement.PreparedStatement;
import AddMultipleDataByPreparedstatement.Student;

public class UpdateData {


	void insertStudent(){
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			 String sql="update student set name= ? where rno= ?";
			 java.sql.PreparedStatement stmt= con.prepareStatement(sql);
			            
		                stmt.setString(1, "Shraddha");
                        stmt.setInt(2, 37);

 			stmt.executeUpdate();
             System.out.println("updation is Completed");						
           }
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
			
			try {
				con.close();
			} catch (SQLException e1) {
         e1.printStackTrace();			
	     	}
}
	public static void main(String[] args) {
		UpdateData obj=new UpdateData();
		obj.insertStudent();
		
	}
	
}
