package day1;

class Person1
{
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
}


class Teacher extends Person1
{
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}

public class TeacherTest {

	public static void main(String[] args) 
	{
         Teacher teacher=new Teacher();
         teacher.setId(100);
         teacher.setName("rahul");
         teacher.setAddress("mumbai");
	 teacher.setSalary(40000);
	    
	 System.out.println("id= "+teacher.getId());
	 System.out.println("name= "+teacher.getName());
	 System.out.println("address= "+teacher.getAddress());
	 System.out.println("salary= "+teacher.getSalary());
	    
	    
	}

}
