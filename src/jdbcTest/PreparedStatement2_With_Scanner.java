package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement2_With_Scanner {
  Scanner sc=new Scanner(System.in);
	void insertstudent(){
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root","root");
			String sql = "insert into student values(?,?,?,?)";
			PreparedStatement ps= con.prepareStatement(sql);
			System.out.println("enter Roll no: ");
			int  rno= sc.nextInt();
			System.out.println("Enter your Age: ");
			String Age= sc.next();
			System.out.println("Enter your name: ");
			String name= sc.next();
			System.out.println("Enter your phono: ");
			String mobno= sc.next();
			
			ps.setInt(1, rno);
			ps.setString(2, Age);
			ps.setString(3, name);
			ps.setString(4, mobno);
			ps.executeUpdate();
			System.out.println("insert Value successfully in the Student Table");
			
			String sql2 = "select * from student";
			ResultSet rset= ps.executeQuery(sql2);
			while(rset.next()){
				System.out.println(rset.getInt(1)+"  "+rset.getString(2)+"  "+rset.getString(3)+" "+rset.getString(4));
			}
				
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
      PreparedStatement2_With_Scanner obj=new PreparedStatement2_With_Scanner();
      obj.insertstudent();
		
	}

}
