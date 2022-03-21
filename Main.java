package LibraryManagement;

import java.util.Scanner;

public class Main 
{
   public static void main(String args[])
   {
	   Scanner scan=new Scanner(System.in);
	   Bookinfo book=new Bookinfo();
	    StudentInfo stud=new StudentInfo();
	   System.out.println("-----------------*-* : Student Details : *-*-----------------\n");
       System.out.println("\nEnter Student full Name:");
       stud.name=scan.nextLine();
	   System.out.println("Enter Student Mother Name:");
	    stud.mname=scan.nextLine();
	   System.out.println("Enter Student Enrollement Number:");
	   stud.enrollmentno=scan.nextLine();
	   System.out.println("Enter Student Semister:");
	   stud.semister=scan.nextInt();
	   System.out.println("Enter Student University Id:");
	   stud.u_id=scan.nextInt();
	   
	   stud.getData(stud.name, stud.mname, stud.enrollmentno, stud.semister, stud.u_id);
	   stud.putData();
	  
	   System.out.println("\nPress 1 for Computer Department Book information");
	   System.out.println("Press 2 for Mechanical Department Book information");
	   System.out.println("Press 3 for Civil Department Book information");
	   System.out.println("Press 4 for Electronic Department Book information");
	   System.out.println("Press 5 for Motivation book inforamation");
	   System.out.println("\nRelated Number Press here:");
	   int choice=scan.nextInt();
		
	   switch(choice)
		{
		case 1:
			book.computerDept();
			break;
			
		case 2:
			book.mechanicalDept();
			break;
			
		case 3:
			book.civilDept();
			break;
			
		case 4:
			book.electronicsDept();
			break;
			
		case 5:
			book.motivationBookInfo();
			break;
			
	   default:
			System.out.println("Please..! press the correct button...");
		}
      }
   }

