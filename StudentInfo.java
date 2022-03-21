package LibraryManagement;

public class StudentInfo 
{
     String name,mname,enrollmentno;
     int semister,u_id;
     // Parametrized method
     public void getData(String name,String mname, String enrollmentno, int semister,int u_id)
     {
    	 this.mname= mname;
    	 this.name=name;
    	 this.semister=semister;
    	 this.enrollmentno=enrollmentno;
    	 this.u_id=u_id;
     }
     // method decalration and defination
     public void putData()
     {
    	 System.out.println("-----------------: Student Information :----------------");
    	 System.out.println("Student's Full Name:"+" "+name);
    	 System.out.println("\nStudent's Mother name:"+" "+mname);
    	 System.out.println("\nStudent Unique Id:"+" "+u_id);
    	 System.out.println("\nStudent Enrollent Number:"+" "+enrollmentno);
    	 System.out.println("\nStudent Current Semister:"+" "+semister);
      }
}
