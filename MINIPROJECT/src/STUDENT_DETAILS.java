
public class STUDENT_DETAILS {
	private String std_fname;
	private String std_lname;
	private String std_pname;
	private String std_email;
	private long std_phnum;
	private double std_marks;
	private long std_icet;
	private String std_dob;
	public STUDENT_DETAILS()
	{
		
	}
	public STUDENT_DETAILS(String std_fname, String std_lname, String std_pname, String std_email, long std_phnum,
			double std_marks, long std_icet, String std_dob) {
		super();
		this.std_fname = std_fname;
		this.std_lname = std_lname;
		this.std_pname = std_pname;
		this.std_email = std_email;
		this.std_phnum = std_phnum;
		this.std_marks = std_marks;
		this.std_icet = std_icet;
		this.std_dob = std_dob;
	}
	public String getStd_fname() {
		return std_fname;
	}
	public void setStd_fname(String std_fname) {
		this.std_fname = std_fname;
	}
	public String getStd_lname() {
		return std_lname;
	}
	public void setStd_lname(String std_lname) {
		this.std_lname = std_lname;
	}
	public String getStd_pname() {
		return std_pname;
	}
	public void setStd_pname(String std_pname) {
		this.std_pname = std_pname;
	}
	public String getStd_email() {
		return std_email;
	}
	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}
	public long getStd_phnum() {
		return std_phnum;
	}
	public void setStd_phnum(long std_phnum) {
		this.std_phnum = std_phnum;
	}
	public double getStd_marks() {
		return std_marks;
	}
	public void setStd_marks(double std_marks) {
		this.std_marks = std_marks;
	}
	public long getStd_icet() {
		return std_icet;
	}
	public void setStd_icet(long std_icet) {
		this.std_icet = std_icet;
	}
	public String getStd_dob() {
		return std_dob;
	}
	public void setStd_dob(String std_dob) {
		this.std_dob = std_dob;
	}

}

