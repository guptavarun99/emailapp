package emailapp;

import java.util.Scanner;

public class Email {

	private int id;
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;
	private int defaultPasswordlength = 6;
	private String email;
	private String companysuffix = "amazon.com";

	public Email(String firstname, String lastname, int id) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;

		this.department = setDepartment();
		if (department != "invalid")
			System.out.println("DepartmentName :" + this.department);

		this.password = RandomPassword(defaultPasswordlength);
		if (department != "invalid")
			System.out.println("Your Password is: " + this.password);
		else
			System.out.println("cannot generate password");

		email = firstname.toLowerCase() + lastname.toLowerCase() + "@" + department + "." + companysuffix;
		System.out.println("Your Email is : " + email);
	}

	private String setDepartment() {
		System.out.print(
				"department codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1)
			return ("sales");
		else if (depChoice == 2)
			return ("development");
		else if (depChoice == 3)
			return ("accounts");
		else
			return ("invalid");
	}

	private String RandomPassword(int len) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] password = new char[len];
		for (int i = 0; i < len; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return (new String(password));
	}

	public void setmailcapacity(int capacity) {
		if (capacity < 100)
			this.mailboxCapacity = capacity;
		else
			System.out.println("capacity very high");
	}

	public void changepassword(String password) {
		if (password.length() >= 8)
			this.password = password;
		else
			System.out.println("password should be greater than 7 characters");
	}

	public void setalternateemail(String altemail) {
		this.alternateEmail = altemail;
	}

	public int getmailboxcapacity() {
		return (mailboxCapacity);
	}

	public String getalternateemail() {
		return (alternateEmail);
	}
}
