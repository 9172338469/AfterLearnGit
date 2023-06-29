package UseSelect_In_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudent {

	
	void selectStudent(){
		Connection con = null;
		
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6","root","root");
		
		Statement stmt= con.createStatement();
		
		String sql = "select * from student";
		System.out.println(sql);
		  ResultSet rs= stmt.executeQuery(sql);

		  while(rs.next()){
			  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		  }
	}  
	
	catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		try {
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}		
	}
	}
		
	public static void main(String[] args) {
    FetchStudent obj=new FetchStudent();
    obj.selectStudent();
	}

}
