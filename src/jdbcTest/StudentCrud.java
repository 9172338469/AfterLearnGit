package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCrud {
	void insertStudent(){
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			Statement stmt= con.createStatement();
			stmt.execute("insert into student values('8', 'bhauu', '43', '744944848')");
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
	
	void updateStudent(){
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			Statement stmt= con.createStatement();
			stmt.execute("update student set name = 'madhav' where rno = '2'");
			System.out.println("Student Update Successfully");
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
	
	void deleteStudent(){
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			Statement stmt= con.createStatement();
			stmt.execute("delete from student where rno = '7'");
			System.out.println("Student deleted Successfully");
		 System.out.println("Student deleted Successfully And Changed");

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
		
	void selectStudent(){
		Connection con = null;
		
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6","root","root");
		
		Statement stmt= con.createStatement();
	  
		ResultSet res= stmt.executeQuery("select * from student");
		System.out.println();

		while(res.next()){
			System.out.println(res.getInt(1) +" "+ res.getString(2) +" "+ res.getString(3) +" "+ res.getString(4));
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
		StudentCrud obj=new StudentCrud();
		obj.insertStudent();
        obj.updateStudent();
        obj.deleteStudent();
		obj.selectStudent();
	}
}
