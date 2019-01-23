package db;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String name;
		
		System.out.println("Please enter a name to delete.");
		name = sc1.next();
		
		
		Connection con1 = DBConnection.openConnection();
		MemberDAO dao1 = new MemberDAO(con1);
		if(dao1.deleteData(name)){
			System.out.println(name + "Delete Complete");
		}else{
			System.out.println(name + "Information does not exist.");
		}
		DBConnection.closeConnection(con1);
		
		//전체 데이터 출력
		ArrayList<MemberDTO> array1 
			= new ArrayList<MemberDTO>();
		Connection con2 = DBConnection.openConnection();
		
		MemberDAO dao2 = new MemberDAO(con2);
		array1 = dao2.selectData();
		DBConnection.closeConnection(con2);

		for(int i=0;i<array1.size();i++){
			MemberDTO temp = array1.get(i);
			System.out.println(temp.toString());
		}
	}
}

















