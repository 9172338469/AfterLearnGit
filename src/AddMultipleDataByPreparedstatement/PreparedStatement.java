package AddMultipleDataByPreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class PreparedStatement {

	void insertStudent(){
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			 String sql="insert into student values(?,?,?)";
			 java.sql.PreparedStatement stmt= con.prepareStatement(sql);
			
			List<Student>stulist = new ArrayList<Student>();

			Student st=new Student();
			st.setRno(1);
			st.setName("Onkar");
			st.setAge("100");
			st.setMobno("74499383837");
			
			Student st1=new Student();
             st.setRno(2);
             st.setName("Satvar");
             st.setAge("200");
             st.setMobno("9337463637");
             
 			Student st2=new Student();
 			st2.setRno(3);
 			st2.setName("Mauli");
            st.setAge("200");
 			st2.setMobno("338376364");
			 
 			stulist.add(st);
 			stulist.add(st1);
 			stulist.add(st2);
             
 			for(Student student : stulist)
 			{
 				stmt.setInt(1, student.getRno());
 				stmt.setString(2, student.getName());
 				stmt.setString(3, student.getAge());
 				stmt.setString(3, student.getMobno());
 				
 			}
 			stmt.executeUpdate();
             System.out.println("Insertion is Completed");						
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
		PreparedStatement obj=new PreparedStatement();
		obj.insertStudent();
		
	}
}
