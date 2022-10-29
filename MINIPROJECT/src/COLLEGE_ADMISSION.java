import java.util.Scanner;

public class COLLEGE_ADMISSION {
public static void main(String[] args) {
		
		DETAILS d=new DETAILS();
		Scanner a=new Scanner(System.in);
		while(true)
		{
	  System.out.println(" 1.STUDENT_DETAILS\n 2.ICET_MARKS\n 3.QUALIFYING_COLLEGES\n 4.STUDENT-DATABSE\n 5.exit");
	  System.out.println("select any one option");
	   int o=a.nextInt();

	   switch(o)
	   {
	   case 1:
		   d.show();
	     break;
	     
	   case 2:
		   d.elg();
		   break;
		   
	   case 3:
		   d.check();                              
		   break;
		   
	   case 4:
		   d.checking();
	   case 5:
		   System.exit(0);
		   
	   }

	}

}
}

