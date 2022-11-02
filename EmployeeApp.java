package examples;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
class Empdetails{
	Scanner sc=new Scanner(System.in);
	private String ename;
	private int eid;
	private long phoneno;
	private int salary;
	private String permanentaddress;
	private String currentaddress;
	private String email;

  
	Empdetails(String ename,int eid,long phoneno,int salary,String permanentaddress,String currentaddress,String email){
		this.ename=ename;
		this.eid=eid;
		this.phoneno=phoneno;
		this.salary=salary;
		this.permanentaddress=permanentaddress;
		this.currentaddress=currentaddress;
		this.email=email;
		
		
	}

	
	public String getEname() {
		return ename;
	}
	public int getEid() {
		return eid;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public int getSalary() {
		return salary;
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
	public String getPermanentaddress() {
		return permanentaddress;
	}public String getCurrentaddress() {
		return currentaddress;
	}
	public String getEmail() {
		return email;
	}
	public String toString() {
		return ename+" "+eid+" "+phoneno+" "+salary+" "+permanentaddress+" "+currentaddress+" "+email;
	}
	

}




public class Empapplication {



	public static void main(String [] args) {
		Collection<Empdetails>list=new ArrayList<Empdetails>();
	
		Scanner emp1 =new Scanner(System.in);
	
		Scanner emp2 =new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
	
		int choice;
		boolean found=false;
		
		
				
		do {
			System.out.println("--------EMPLOYEE APPLICATION----------");
			System.out.println("***************************************");
			System.out.println("1.ADD EMPLOYEE DETAILS");
			System.out.println("2.DELETE EMPLOYEE DETAILS");
			System.out.println("3.UPDATE EMPLOYEE DETAILS");
			System.out.println("4.LIST EMPLOYEE DETAILS");
			System.out.println("Enter your choice: ");
			choice=emp2.nextInt();
			 
	
	
		switch(choice) {
	
	
		case 1:
			System.out.println("Enter Employee Name");
			String ename=emp1.nextLine();
			System.out.println("Enter Employee Id");
			int eid=emp2.nextInt();
			System.out.println("Enter Employee Phone No");
			long phoneno=emp2.nextLong();
			System.out.println("Enter Employee Salary");
			int salary=emp2.nextInt();
			System.out.println("Enter Employee Permanent Address");
			String permanentaddress=emp1.nextLine();
			System.out.println("Enter Employee Current Address");
			String currentaddress=emp1.nextLine();
			System.out.println("Enter Employee Email");
			String email=emp1.nextLine();
			System.out.println("*********COMPLETE YOUR DETAILS ");
			
			list.add(new Empdetails(ename,eid,phoneno,salary,permanentaddress,currentaddress,email));
	
			break;
		case 2:
			 found=false;
			System.out.println("Delete The Employee");
			eid=sc.nextInt();
			Iterator i=list.iterator();
			while(i.hasNext()) {
				Empdetails e=(Empdetails) i.next();
				if(e.getEid()==eid) {
					i.remove();
					found=true;
				}
			}
			if(!found) {
				System.out.println("Record  not foud");}
				else {
					System.out.println("Record Deleted");
					
				}
			
		break;
		case 3:
			found=false;
			System.out.println("Update the Employee");
			int neweid = sc.nextInt();
			ListIterator<Empdetails> newlist = ((ArrayList<Empdetails>) list).listIterator();
			
			while(newlist.hasNext()) {
				Empdetails e=(Empdetails) newlist.next();
				if(e.getEid()==neweid) {
					System.out.println("Update Name");
					String newename=emp1.nextLine();
			

					System.out.println("Update Phone No");
					long newphoneno=emp2.nextLong();
					System.out.println("Update Salary");
					int newsalary=emp2.nextInt();
					System.out.println("Update Permanent Address");
					String newpermanentaddress=emp1.nextLine();
					System.out.println("Update Current Address");
					String newcurrentaddress=emp1.nextLine();
					System.out.println("Update Email");
					String newemail =emp1.nextLine();
					newlist.set(new Empdetails(newename,neweid,newphoneno,newsalary,newpermanentaddress,newcurrentaddress,newemail));
					
					found=true;
					
					
				}
					
				}
			if(!found) {
				System.out.println("NOT FOUND");
			}
			else {
				System.out.println("EMPLOYEE DETAILS UPDATED!!!");
			}
			break;
	
		case 4:
			found=false;
			System.out.println("List Of EmployeeDetails");
		
			for(Empdetails employe:list) {
				System.out.println(employe);
			}
			System.out.println("Enter the ID:");
			eid=sc.nextInt();
			for(Empdetails employe:list) {
				if(employe.getEid()==eid) {
					System.out.println(employe);
					found=true;
				}
			}
			if(!found) {
				System.out.println("Employee with this not found");
			}
			default:
				System.out.println("INVALID CHOICE");
		
		}
	}while(choice!=0);
	}
}
					
			
			
		
		
	
		
			
		
		
	
	

	
	


