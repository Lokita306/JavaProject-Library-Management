package LibraryManagement;

public class Bookinfo 
{
      public void computerDept()
      {
    	  System.out.println("The Books available in the Computer Department:-\n");
    	  String comp[]= {"Operting System","Fundamental of Data Structure","Computer Network","Database managemrnt System","Advance JAVA",
    			                    "Introduction to Computer Security","Computer Architecture","Basic of C","Programming with JAVA","Softweare Engineering",
    			                    "OOPwith JAVA","Web Application Development","Object Oriented Programming","Design and Analyasis of Algorithms"};
  
    	  for(int ctr=0;ctr<comp.length;ctr++)
    	  {
    		  System.out.println(comp[ctr]);
    	  }
      }
      
      public void civilDept()
      {
    	  System.out.println("The Books available in the Civil Department:-\n");
    	  String civil[]= {"Strength of Materials","Mechanics of Structure","Design of RC Structures","Water Resources Engineering","Engineering Drawing and Graphics",
    			                  "Hydraulics","IT & CAD Applications","Design of Steel Structures","IT & CAD Applications","Soil Mechanics & Foundation Engineering",
    			                  "Surveying I","Surveying II","Design of RC Structures","Introduction to Manufacturing Processes","Basics of Building design"};
    	  for(int ctr=0;ctr<civil.length;ctr++)
    	  {
    		  System.out.println(civil[ctr]);
    	  }
      }
      
      public void electronicsDept()
      {
    	  System.out.println("The Books available in the Electronic Department:-\n");
    	  String elect[]= {"Telecommunications Engineering","Embedded Systems Design","Microelectronics","Electromagnetic Engineering","Control Engineering",
    			                   "Instrumentation Engineering","VLSI Design Engineering","Signals & Systems","Electronic Devices & Circuits (EDC)","Linear Engineering",
    			                   	"Digital System","Control Systems","Design Circuit and Networks","Laboratory Design","Instrumentation Systems", "Linear Integrated Circuits"};    			 
    	  for(int ctr=0;ctr<elect.length;ctr++)
    	  {
    		  System.out.println(elect[ctr]);
    	  }
      }
      public void mechanicalDept()
      {
    	  System.out.println("The Books available in the Mechanical Department:\n");
    	  String mech[]= {"Material Science and Engineering","Engineering Mechanics","Heat Transfer", "Fluid Mechanics","Machine Drawing","Steam Power Plant",
    	  		                   "Fluid Machinery","Kinematic Analysis and Synthesis","Manufacturing Processes","Applied Mechanics Lab","Machining Technology and Metrology",
    	  		                   "Dynamics of Machines","Metrology and Metallography Lab","Electrohydraulic Control Systems","Strength of material","Engineering Drawing"};
    	  for(int ctr=0;ctr<mech.length;ctr++)
    	  {
    		  System.out.println(mech[ctr]);
    	  }
      }
      public void motivationBookInfo()
      {
    	  System.out.println("Motivational Book Information:\n");
    	  String motivational[] = {"Think and Grow Rich","The 7 Habits of Highly Effective People","The Power of Positive Thinking"," How to Win Friends and Influence People ",
    			                               "You Are a Badass: How to Stop Doubting Your Greatness and Start Living an Awesome Life"," You Can Heal Your Life"," Man’s Search for Meaning",
    			                               "The Alchemist","Grit: The Power of Passion and Perseverance","Mindset: The New Psychology of Success","Smarter, Faster, Better by Charles Duhigg"};
    	  for(int ctr=0;ctr<motivational.length;ctr++)
    	  {
    		  System.out.println(motivational[ctr]);
    	  }
      }
} 

