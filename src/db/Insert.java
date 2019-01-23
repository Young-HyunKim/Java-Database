package db;

import java.sql.Connection;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		MemberDTO person1 = new MemberDTO();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input Name");
		person1.setName(sc1.next());
		System.out.println("Input Email");
		person1.setEmail(sc1.next());
		System.out.println("Input Password");
		person1.setPassword(sc1.next());
		System.out.println("Input StudentPhone");
		person1.setStudentPhone(sc1.next());
		System.out.println("Input ParentPhone");
		person1.setParentPhone(sc1.next());
		
		Connection con  = DBConnection.openConnection();
		MemberDAO dao1 = new MemberDAO(con);
		dao1.insertData(person1);
		DBConnection.closeConnection(con);
	}
}







