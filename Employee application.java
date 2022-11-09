package Newproject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.UUID;
class Employeedetails{
	private String name;
	private int id;
	private String phoneno;
	private int salary;
	private String permanentaddress;
	private String currentaddress;
	private String email;
	
	Employeedetails(String name,int id,String phoneno,int salary,String permanentaddress,String currentaddress,String email){
		this.name=name;
		this.id=id;
		this.phoneno=phoneno;
		this.salary=salary;
		this.permanentaddress=permanentaddress;
		this.currentaddress=currentaddress;
		this.email=email;
	}
		
		
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getPhoneno() {
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
		return name+" "+id+" "+phoneno+" "+salary+" "+permanentaddress+" "+currentaddress+" "+email;
	}
	}

	

public class Employeeapplication {
	static boolean isValid(String email) {
		String regex="^[A-Za-z0-9+_.-]+(@gmail.com|@yahoo.com)";
	return email.matches(regex);
	}




	public static void main(String [] args) {
		
		UUID uuid=UUID.randomUUID();
		String uuidAsString=uuid.toString();
		Collection<Employeedetails>list=new ArrayList<Employeedetails>();
	
	
		Scanner emp1 =new Scanner(System.in);
	
		Scanner emp2 =new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		int choice;
		boolean found=false;
		double tax;
		int emailvalid;
		int phonevalid;
		
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
			String name=emp1.nextLine();
			UUID uuid1=UUID.randomUUID();	
		 int eid  =	uuid1.hashCode();
		 System.out.println("Enter Employee Id:"+eid);	  
			String phoneno=emp1.nextLine();
	for(phonevalid=0;phonevalid<=1;phonevalid++) {
		System.out.println("Enter Employee Phone No");
		phoneno= sc.next();
				if(phoneno.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")) {
				
				System.out.println(" valid");
				break;
				}else
				{
				
					System.out.println("not valid");
				}
	}
System.out.println("Enter Employee Salary");
			int salary=emp2.nextInt();
			System.out.println("Enter Employee Permanent Address");
			String permanentaddress=emp1.nextLine();
			System.out.println("Enter Employee Current Address");
			String currentaddress=emp1.nextLine();
		String email=emp1.nextLine();
		      for(emailvalid=0;emailvalid<=1;emailvalid++) {
				System.out.println("Enter the email");
				email=sc.next();
				
				if(isValid(email) == true) {
					System.out.println(" valid");
					break;
				}
				else {
					System.out.println(" invalid");
				}
				}
			
	 System.out.println("*********COMPLETE YOUR DETAILS************ ");
			
			list.add(new Employeedetails(name,eid,phoneno,salary,permanentaddress,currentaddress,email));
			break;
			
			
		case 2:
			 found=false;
			System.out.println("Delete  Employee Id");
			
		    eid =sc.nextInt();
		
			Iterator iterator=list.iterator();
			
			while(iterator.hasNext()) {
			
				Employeedetails employee=(Employeedetails) iterator.next();
				if(employee.getId()==eid) {
			
					iterator.remove();
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
			System.out.println("Update the Employee ");
			System.out.println("Enter the id");
			
			int newid = sc.nextInt();
			ListIterator<Employeedetails> newlist = ((ArrayList<Employeedetails>) list).listIterator();
			
			while(newlist.hasNext()) {
				Employeedetails employee=(Employeedetails) newlist.next();
				if(employee.getId()==newid) {
					System.out.println("Update Name");
					String newname=emp1.nextLine();
					String newphoneno=emp1.nextLine();
					for(phonevalid=0;phonevalid<=1;phonevalid++) {
						System.out.println("Enter Employee Phone No");
						newphoneno= sc.next();
								if(newphoneno.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")) {
								
								System.out.println(" valid");
								break;
								}else
								{
								
									System.out.println("not valid");
								}
					}
					
					System.out.println("Update Salary");
					int newsalary=emp2.nextInt();
				
					if(newsalary<=10000) {
						System.out.println(newsalary+"not tax");
					}
					else if(newsalary>10000&&newsalary<=10000) {
						tax=newsalary*0.10;
						System.out.println(newsalary+"Taxamount:"+tax);
					}
					else {
						tax=newsalary*0.20;
						System.out.println(newsalary+" "+tax);
					}
					System.out.println("Update Permanent Address");
					String newpermanentaddress=emp1.nextLine();
					System.out.println("Update Current Address");
					String newcurrentaddress=emp1.nextLine();
					String newemail =emp1.nextLine();
					for(emailvalid=0;emailvalid<=1;emailvalid++) {
						System.out.println("Enter the email");
						
						newemail=sc.next();
						
						if(isValid(newemail) == true) {
							System.out.println("Email valid");
							break;
						}
						else {
							System.out.println("Email invalid");
						}
					}
					
					newlist.set(new Employeedetails(newname,newid,newphoneno,newsalary,newpermanentaddress,newcurrentaddress,newemail));
					
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
		
			for(Employeedetails employee:list) {
				System.out.println(employee);
			}
			System.out.println("Enter the ID:");
		eid=sc.nextInt();
			for(Employeedetails employee:list) {
				if(employee.getId()==eid) {
					System.out.println(employee);
					found=true;
				}
			}
			if(!found) {
				System.out.println("Employee with this not found");
			}
			
		
		}
	}while(choice!=0);
	}
}

					
			
			
		
		
	
		
			
		
		
	
	

	
	




