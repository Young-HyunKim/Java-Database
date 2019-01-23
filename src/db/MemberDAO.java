package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection con;

	public MemberDAO(Connection con) {
		super();
		this.con = con;
	}
	
	ArrayList<MemberDTO> searchNameData(String name){
		ArrayList<MemberDTO> array1 = new ArrayList<MemberDTO>();
		String sql ="select name, email, password, studentphone, "
				+ "parentphone from member where name = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				MemberDTO temp = new MemberDTO();
				temp.setName(rs.getString("name"));
				temp.setEmail(rs.getString("email"));
				temp.setPassword(rs.getString("password"));
				temp.setStudentPhone(rs.getString("studentphone"));
				temp.setParentPhone(rs.getString("parentphone"));
				array1.add(temp);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return array1;
	}
	
	/**
	 * member Table All Search
	 * @return : member Table All Information
	 */
	public ArrayList<MemberDTO> selectData(){
		ArrayList<MemberDTO> array1 = new ArrayList<MemberDTO>();
		String sql = "select name, email, password, studentphone, "
				+ "parentphone from member";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()){
				MemberDTO temp = new MemberDTO();
				temp.setName(rs.getString("name"));
				temp.setEmail(rs.getString("email"));
				temp.setPassword(rs.getString("password"));
				temp.setStudentPhone(rs.getString("studentphone"));
				temp.setParentPhone(rs.getString("parentphone"));

				array1.add(temp);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return array1;
	}
	
	/**
	 * member Table Member Information Input
	 * @param obj1 : MemberInformation(name, email, password, student_number, parent_number)
	 */
	public void insertData(MemberDTO obj1){
		String sql="insert into member values(?,?,?,?,?)";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj1.getName());
			pstmt.setString(2, obj1.getEmail());
			pstmt.setString(3, obj1.getPassword());
			pstmt.setString(4, obj1.getStudentPhone());
			pstmt.setString(5, obj1.getParentPhone());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	void updateData(MemberDTO obj){
		String sql = "update member set email=?, password=?, "
				+ "studentphone=?, parentphone=? where name=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.getEmail());
			pstmt.setString(2, obj.getPassword());
			pstmt.setString(3, obj.getStudentPhone());
			pstmt.setString(4, obj.getParentPhone());
			pstmt.setString(5, obj.getName());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean deleteData(String name){
		boolean key = false;
		String sql ="delete from member where name=?";
		try {
			PreparedStatement pstmt 
				= con.prepareStatement(sql);
			pstmt.setString(1, name);
			if(pstmt.executeUpdate() == 1){
				key = true;
			}else{
				key = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return key;
	}
	
}











