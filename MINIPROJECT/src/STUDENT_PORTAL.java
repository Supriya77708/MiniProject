import java.util.Scanner;
public class STUDENT_PORTAL {
	String stdfname;
	String stdlname;
	String stdpname;
	String stdemail;
	long stdphnum;
	double stdmarks,stdmarks2,stdmarks3;
	long icet;
	String dob1;

	STUDENT_DETAILS st1=new STUDENT_DETAILS();
	STUDENT_DETAILS st2=new STUDENT_DETAILS();
	STUDENT_DETAILS st3=new STUDENT_DETAILS();

	public void show()
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("student_details 1");
	System.out.println("Enter student_firstname:");
	stdfname=sc.next();
	
	System.out.println("Enter student_lastname:");
	stdlname=sc.next();
	
	System.out.println("Enter Date_of_birth in DD-MM-YY format");
	dob1=sc.next();
	
	System.out.println("Enter student_parentname:");
	stdpname=sc.next();
	
	System.out.println("Enter student_email:");
	stdemail=sc.next();
	
	System.out.println("Enter student_phone number:");
	stdphnum=sc.nextLong();
	
	System.out.println("Enter student_marks:");
	stdmarks=sc.nextDouble();
	
	System.out.println("Enter your icet_Admitcard");
	icet=sc.nextLong();
	
	st1.setStd_email(stdemail);
	st1.setStd_fname(stdfname);
	st1.setStd_lname(stdlname);
	st1.setStd_phnum(stdphnum);
	st1.setStd_marks(stdmarks);
	st1.setStd_dob(dob1);
	st1.setStd_pname(stdpname);
	st1.setStd_icet(icet);
	
	System.out.println("student_details 2");
	System.out.println("Enter student_firstname:");
	stdfname=sc.next();
	
	System.out.println("Enter student_lastname:");
	stdlname=sc.next();
	
	System.out.println("Enter Date_of_birth in DD-MM-YY format");
	dob1=sc.next();
	
	System.out.println("Enter student_parentname:");
	stdpname=sc.next();
	
	System.out.println("Enter student_email:");
	stdemail=sc.next();
	
	System.out.println("Enter student_phone number:");
	stdphnum=sc.nextLong();
	
	System.out.println("Enter student_marks:");
	stdmarks=sc.nextDouble();
	
	System.out.println("Enter your icet_Admitcard");
	icet=sc.nextLong();
	
	st2.setStd_email(stdemail);
	st2.setStd_fname(stdfname);
	st2.setStd_lname(stdlname);
	st2.setStd_phnum(stdphnum);
	st2.setStd_marks(stdmarks);
	st2.setStd_dob(dob1);
	st2.setStd_pname(stdpname);
	st2.setStd_icet(icet);

	
		
	System.out.println("student_details 3");
	System.out.println("Enter student_firstname:");
	stdfname=sc.next();
	
	System.out.println("Enter student_lastname:");
	stdlname=sc.next();
	
	System.out.println("Enter Date_of_birth in DD-MM-YY format");
	dob1=sc.next();
	
	System.out.println("Enter student_parentname:");
	stdpname=sc.next();
	
	System.out.println("Enter student_email:");
	stdemail=sc.next();
	
	System.out.println("Enter student_phone number:");
	stdphnum=sc.nextLong();
	
	System.out.println("Enter student_marks:");
	stdmarks=sc.nextDouble();
	
	System.out.println("Enter your icet_Admitcard");
	icet=sc.nextLong();
	
	st3.setStd_email(stdemail);
	st3.setStd_fname(stdfname);
	st3.setStd_lname(stdlname);
	st3.setStd_phnum(stdphnum);
	st3.setStd_marks(stdmarks);
	st3.setStd_dob(dob1);
	st3.setStd_pname(stdpname);
	st3.setStd_icet(icet);

	}	
	
}
class STD_ELG extends STUDENT_PORTAL
{
	long icet_marks1,icet_marks2,icet_marks3;

	public void elg()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your icet_admit card");
		long ic=s.nextLong();
		if(ic==st1.getStd_icet())  
		{
			System.out.println("Enter Date_of_birth in DD-MM-YY format");
			String d=s.next();
			
			System.out.println("Enter student_phone number:");
			long p=s.nextLong();
		if(d.equals(st1.getStd_dob()) || p==st1.getStd_phnum())
			{
			     icet_marks1=2003;
				System.out.println("your following details...");
				System.out.println("STUDENT NAME="+st1.getStd_fname()+" "+st1.getStd_lname()+"\nSTUDENT ADMITCARD="+st1.getStd_icet()+"\nSTUDENT RANK="+icet_marks1);
				
			}
		}
		else if(ic==st2.getStd_icet())
		{
			System.out.println("Enter Date_of_birth in DD-MM-YY format");
			String d=s.next();
			
			System.out.println("Enter student_phone number:");
			long p=s.nextLong();
		if(d.equals(st2.getStd_dob()) || p==st2.getStd_phnum())
			{
			     icet_marks2=3509;
				System.out.println("your following details...");
				System.out.println("STUDENT NAME="+st2.getStd_fname()+" "+st2.getStd_lname()+"\nSTUDENT ADMITCARD="+st2.getStd_icet()+"\nSTUDENT RANK="+icet_marks2);
				
			}
		}
		else if(ic==st3.getStd_icet())
		{
			System.out.println("Enter Date_of_birth in DD-MM-YY format");
			String d=s.next();
			
			System.out.println("Enter student_phone number:");
			long p=s.nextLong();
		if(d.equals(st3.getStd_dob()) || p==st3.getStd_phnum())
			{
			     icet_marks3=4590;
				System.out.println("your following details...");
				System.out.println("STUDENT NAME="+st3.getStd_fname()+" "+st3.getStd_lname()+"\nSTUDENT ADMITCARD="+st3.getStd_icet()+"\nSTUDENT RANK="+icet_marks3);
				
			}
		}	
			else
			{
				System.out.println("ENTER DETAILS CORRECTLY");
			}
   }
}
class CHECKING extends STD_ELG
{
	long ch,dg;
	String cl1,cl2,cl3,b1,b2,b3;
	public void check()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter your Icet_rank");
		ch=ss.nextLong();
		System.out.println("Enter your degree_marks");
		dg=ss.nextLong();
		
		if((ch>=50 && ch<=2500) && (dg>=76 && dg<=98))
		{

			System.out.println("you are eligible for following colleges");

			System.out.println("osmania university");

			System.out.println("jntu");

			System.out.println("Cbit");
		
			System.out.println("Av college");
			
			System.out.println("select any one college");
			cl1=ss.next();
			
			System.out.println("select branch from below option");
			
			System.out.println("MCA");
			
			System.out.println("MBA");
			b1=ss.next();
			
		}
		else if((ch>=2501 && ch<=3500) && (dg>=65 && dg<=75))
		{

			System.out.println("you are eligible for following colleges");

			System.out.println("loyola");

			System.out.println("Aurora");

			System.out.println("Avanthii");
		
			System.out.println("st.joseph");
			
			System.out.println("select any one college");
			cl2=ss.next();
			
			System.out.println("select branch from below option");
			
			System.out.println("MCA");
			
			System.out.println("MBA");
			b2=ss.next();
			
			
		}
		else if((ch>=3501 && ch<=5000) && (dg>=35 && dg<=64))
		{

			System.out.println("you are eligible for following colleges");

			System.out.println("haindhavi");

			System.out.println("siddhartha");

			System.out.println("sphoorthy");
				
			System.out.println("select any one college");
			cl3=ss.next();
			
			System.out.println("select branch from below option");
			
			System.out.println("MCA");
			
			System.out.println("MBA");
			b3=ss.next();
			
		}
		else
		{
			System.out.println("you are not eligible");
		}
	}
}
 class DETAILS extends CHECKING
 {
	 public void checking()
	 {
		 System.out.println("student database");
		 
		 System.out.println("1.STUDENT NAME="+st1.getStd_fname()+" "+st1.getStd_lname());
		 System.out.println("STUDENT PARENT_NAME="+st1.getStd_pname());
		 System.out.println("STUDENT EMAIL_ID="+st1.getStd_email()+"\nSTUDENT_PHONE_NUMBER="+st1.getStd_phnum());
		 System.out.println("STUDENT_DATE_OF_BIRTH="+st1.getStd_dob());
		 System.out.println("STUDENT_ADMIT_CARD="+st1.getStd_icet()+"  STUDENT_ICET_RANK="+icet_marks1);
		 System.out.println("STUDENT_SELECTED_COLLEGE="+cl1+" STUDENT_SELECTED_BRANCH="+b1);
		 
		 System.out.println("1.STUDENT NAME="+st2.getStd_fname()+" "+st2.getStd_lname());
		 System.out.println("STUDENT PARENT_NAME="+st2.getStd_pname());
		 System.out.println("STUDENT EMAIL_ID="+st2.getStd_email()+"\nSTUDENT_PHONE_NUMBER="+st2.getStd_phnum());
		 System.out.println("STUDENT_DATE_OF_BIRTH="+st2.getStd_dob());
		 System.out.println("STUDENT_ADMIT_CARD="+st2.getStd_icet()+"  STUDENT_ICET_RANK="+icet_marks2);
		 System.out.println("STUDENT_SELECTED_COLLEGE="+cl2+" STUDENT_SELECTED_BRANCH="+b2);
		 
		 System.out.println("1.STUDENT NAME="+st3.getStd_fname()+" "+st3.getStd_lname());
		 System.out.println("STUDENT PARENT_NAME="+st3.getStd_pname());
		 System.out.println("STUDENT EMAIL_ID="+st3.getStd_email()+"\nSTUDENT_PHONE_NUMBER="+st3.getStd_phnum());
		 System.out.println("STUDENT_DATE_OF_BIRTH="+st3.getStd_dob());
		 System.out.println("STUDENT_ADMIT_CARD="+st3.getStd_icet()+"  STUDENT_ICET_RANK="+icet_marks3);
		 System.out.println("STUDENT_SELECTED_COLLEGE="+cl3+" STUDENT_SELECTED_BRANCH="+b3);
		 
		 		 
 }
}