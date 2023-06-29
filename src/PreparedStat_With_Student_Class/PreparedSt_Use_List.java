//package PreparedStat_With_Student_Class;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PreparedSt_Use_List {
//
//	void insertStudent(List<Student> list){
//		Connection con = null;
//		try{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
//			PreparedStatement pstmt= con.prepareStatement("insert into student values(?,?,?,?)");
//			
//				for(Student student: list){
//					pstmt.setInt(1, stu.getRno());
//					pstmt.setString(2, stu.getAge());
//					
//					
//					
//					
//					pstmt.executeUpdate();
//
//				}
//
//
//			System.out.println("Student inserted Successfully");
//		
//             String sql1="select * from student";
//            ResultSet rs= pstmt.executeQuery(sql1);
//            while(rs.next()){
//            	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//            }
//		}
//		catch(ClassNotFoundException | SQLException e){
//			e.printStackTrace();
//		}
//		finally {
//			try{
//			con.close();
//			}
//			catch(SQLException e){
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		List<Student>list=new ArrayList<Student>();
//		Student stu=new Student();
//		stu.setRno(19);
//		stu.setAge("71");
//		stu.setName("Sharma");
//		stu.setMobno("74975228834");
//		
//        Student stu1=new Student();
//        stu1.setRno(20);
//		stu1.setAge("72");
//		stu1.setName("Dharm");
//		stu1.setMobno("74975228834");
//		
//	    Student stu2=new Student();
//            stu2.setRno(21);
//			stu2.setAge("73");
//			stu2.setName("Varma");
//			stu2.setMobno("74975228834");
//			
//			list.add(stu);
//			list.add(stu1);
//			list.add(stu2);
//		PreparedSt_Use_List obj=new PreparedSt_Use_List();
//		obj.insertStudent(list);
//}
//}
