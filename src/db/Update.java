package db;

import java.sql.Connection;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		MemberDTO person1 = new MemberDTO();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter a name to modify.");
		person1.setName(sc1.next());
		System.out.println("Please enter a email to modify.");
		person1.setEmail(sc1.next());
		System.out.println("Please enter a password to modify.");
		person1.setPassword(sc1.next());
		System.out.println("Please enter a StudentPhone to modify.");
		person1.setStudentPhone(sc1.next());
		System.out.println("Please enter a ParentPhone to modify.");
		person1.setParentPhone(sc1.next());
		//System.out.println(person1.toString());

		Connection con = DBConnection.openConnection();
		MemberDAO dao1 = new MemberDAO(con);
		dao1.updateData(person1);
		DBConnection.closeConnection(con);
	}
}






