import java.util.Scanner;
import java.util.ArrayList;
class rohan6{
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Employee> employees = new ArrayList<>();
	public static void main(String[] args){
		boolean first=true;
		boolean show_menu=true;
		while(true){
			if(show_menu){
				if(first){
					System.out.println("\n----------Welcome to Employee Management System----------");
					first=false;
				}
				else{
					System.out.println("\n----------Employee Management System----------");
				}
				System.out.println("1.Insert an employee");
				System.out.println("2.Edit an employee");
				System.out.println("3.Delete an employee");
				System.out.println("4.search an employee");
				System.out.println("5.search all employee");
				System.out.println("6.quit");
				show_menu=false;
			}
			System.out.print("\nEnter your choice: ");
			if(sc.hasNextInt()){
				int option=sc.nextInt();
				sc.nextLine();
				if(option>=1 && option <=6){
					switch(option){
						case 1:{
							insert();
							break;
						}
						case 2:{
							edit();
							break;
						}
						case 3:{
							delete();
							break;
						}
						case 4:{
							search();
							break;
						}
						case 5:{
							search_all();
							break;
						}
						case 6:{
							System.out.println();
							return;
						}
					}
					show_menu=true;
				}
				else{
					System.out.println("\nChoose only between 1 and 6");
			        }
			}	
			else{
				System.out.println("\nPlease Choose only a number");
				sc.next();
			}
		}
	}
	static void insert(){
		int id=0,age=0;
		String name="",designation="";
		while(true){
			try{
				System.out.print("Enter id: ");
				id=Integer.parseInt(sc.nextLine());
				boolean exists=false;
				for(Employee emp:employees){
					if(emp.id==id){
						exists=true;
						break;
					}
				}
				if(exists){
					System.out.println("Error: Employee with id already exists");
					return;
				}
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Error: id field can be only number");
			}
		}

		while(true){
			System.out.print("Enter name: ");
			name=sc.nextLine();
			if(name.matches(".*\\d.*")){
				System.out.println("error name field can only be String");
			}
			else{
				break;
			}
		}
        
		while(true){
			
			try{
				System.out.print("Enter Age: ");
				age=Integer.parseInt(sc.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Error: Age field can be only number");
			}
		}

		while(true){
			System.out.print("Enter designation: ");
			designation=sc.nextLine();
			if(designation.matches(".*\\d.*")){
				System.out.println("error designation field can only be String");
			}
			else{
				break;
			}
		}

		Employee emp=new Employee(id,name,age,designation);
		employees.add(emp);

		System.out.println("Record added: "+emp.id+", "+emp.name+", "+emp.age+", "+emp.designation);
	}
		
	static void edit(){
		if(employees.isEmpty()){
			System.out.println("no employees available to edit");
			return;
		}
		int searchId;
		while(true){
			try{
				System.out.print("Enter employee id to edit: ");
				searchId=Integer.parseInt(sc.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Error: id must be number");
			}
		}
		Employee target = null;
		for(Employee emp:employees){
			if(emp.id==searchId){
				target=emp;
				break;
			}
		}
		if(target==null){
			System.out.println("No employee found with id: "+searchId);
			return;
		}

		System.out.println("Record found: "+target.id+" "+target.name+" "+target.age+" "+target.designation);
		System.out.println("Which field do you want to edit?");
		System.out.println("1. Name");
		System.out.println("2. Age");
		System.out.println("3. Designation");
		
		int choice=0;
		while(true){
			System.out.print("\nEnter your choice between 1 to 3: ");
			if(sc.hasNextInt()){
				choice=sc.nextInt();
				sc.nextLine();
				if(choice >= 1 && choice <=3){
					break;
				}
				else{
					System.out.println("should be between 1 and 3");
				}
			}
			else{
				System.out.println("enter only a number");
				sc.next();
			}
		}
		switch(choice){
			case 1:{
				while(true){
					System.out.print("Enter new name: ");
					String newName=sc.nextLine();
					if(newName.matches(".*\\d.*")){
						System.out.println("Error: name field can only be a String");
					}
					else{
						target.name=newName;
						break;
					}
				}
				break;
			}
			case 2:{
				while(true){
					try{
						System.out.print("Enter new age: ");
						int newAge=Integer.parseInt(sc.nextLine());
						target.age=newAge;
						break;
					}
					catch(NumberFormatException e){
						System.out.println("Error: Age field should be a number");
					}
				}
				break;
			}
			case 3:{
				while(true){
					System.out.print("Enter new designation");
					String newDesig=sc.nextLine();
					if(newDesig.matches(".*\\d.*")){
						System.out.println("Error: designation can only be a String");
					}
					else{
						target.designation=newDesig;
						break;
					}
				}
	
			}
			
		}
	
		System.out.println("Updated Record: "+target.id+" "+target.name+" "+target.age+" "+target.designation);
	}
	static void delete(){
		if(employees.isEmpty()){
			System.out.println("No employees available to delete");
			return;
		}
		int searchId=0;
		while(true){
			try{
				System.out.print("Enter employee id to delete: ");
				searchId=Integer.parseInt(sc.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Error: id must be a number");
			}
		}
		Employee target=null;
		for(Employee emp:employees){
			if(emp.id==searchId){
				target=emp;
				break;
			}
		}
		
		if(target==null){
			System.out.println("No employee found with id: "+searchId);
		}
		else{
			employees.remove(target);
			System.out.println("Employee with id "+searchId+" deleted successfully");
		}
	}
	static void search(){
		if(employees.isEmpty()){
			System.out.println("No employees to search.");
			return;
		}
		int searchId=0;
		while(true){
			try{
				System.out.print("Enter employee id to search: ");
				searchId=Integer.parseInt(sc.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("error: id must be a number");
			}
		}

		boolean found = false;
		for(Employee emp:employees){
			if(emp.id==searchId){
				System.out.println("Record found "+emp.id+" "+emp.name+" "+emp.age+" "+emp.designation);
				found=true;
				break;
			}
		}
		if(!found){
			System.out.println("No employee found with id: "+searchId);
		}
	}
	static void search_all(){
		if(employees.isEmpty()){
			System.out.println("No employee records available");
			return;
		}
		System.out.println("\nAll Employee Records: ");
		for(Employee emp:employees){
			System.out.println(emp.id+" "+emp.name+" "+emp.age+" "+emp.designation);
		}
	}
}

class Employee{
	int id;
	String name;
	int age;
	String designation;

	Employee(int id,String name,int age,String designation){
		this.id=id;
		this.name=name;
		this.age=age;
		this.designation=designation;
	}
}
