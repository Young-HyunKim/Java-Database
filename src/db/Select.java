package db;

import java.sql.Connection;
import java.util.ArrayList;

public class Select {

	public static void main(String[] args) {
		ArrayList<MemberDTO> array1 = new ArrayList<MemberDTO>();

		Connection con = DBConnection.openConnection();
		MemberDAO dao1 = new MemberDAO(con);
		
		array1 = dao1.searchNameData(""); // Enter the name you want to find 
		DBConnection.closeConnection(con);

		for(int i=0;i<array1.size();i++){
			MemberDTO temp = array1.get(i);
			System.out.println("TestDB3:" + temp.toString());
			
		}
	}

}
