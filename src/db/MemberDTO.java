package db;

public class MemberDTO {
	private String name;
	private String email;
	private String password;
	private String studentPhone;
	private String parentPhone;
	public MemberDTO() {
		super();
	}
	public MemberDTO(String name, String email, String password,
			String studentPhone, String parentPhone) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.studentPhone = studentPhone;
		this.parentPhone = parentPhone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getParentPhone() {
		return parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", email=" + email + ", password="
				+ password + ", studentPhone=" + studentPhone
				+ ", parentPhone=" + parentPhone + "]";
	}	
}





