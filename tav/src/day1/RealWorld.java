package day1;

public class RealWorld {

	public static void main(String[] args) 
	{
	Car car1= new Car();
	car1.setBrand("nissan");
	car1.setName("torrento");
	car1.setColor("Red");

	System.out.println("Car Brand:"+car1.getBrand()+"\nCar Name:"+car1.getName()+"\nCar Color:"+car1.getColor());
	
	Car car2= new Car();
	car2.setBrand("toyota");
	car2.setName("innova");
	car2.setColor("white");
	
	System.out.println("\nCar Brand:"+car2.getBrand()+"\nCar Name:"+car2.getName()+"\nCar Color:"+car2.getColor());
	
	Person person1= new Person();
	person1.setAge(30);
	person1.setGender('M');
	person1.setHeight(789);
	person1.setName("rahul");
	
	System.out.println("\nPerson Age:"+person1.getAge()+"\nPerson Gender:"+person1.getGender()+"\nPerson Height:"+person1.getHeight()+"\nPerson Name:"+person1.getName());
	
	Person person2= new Person();
	person2.setAge(40);
	person2.setGender('F');
	person2.setHeight(600);
	person2.setName("sonal");
	
	System.out.println("\nPerson Age:"+person2.getAge()+"\nPerson Gender:"+person2.getGender()+"\nPerson Height:"+person2.getHeight()+"\nPerson Name:"+person2.getName());
	
	Building building1=new Building();
	building1.setArea("Borivali");
	building1.setName("Triveni Contour");
	
	System.out.println("\nBuilding Area:"+building1.getArea()+"\nBuilding Name:"+building1.getName());
	
	Building building2=new Building();
	building2.setArea("Dahisar");
	building2.setName("kaveri");
	
	System.out.println("\nBuilding Area:"+building2.getArea()+"\nBuilding Name:"+building2.getName());
	

	}
	}

class Person
{
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	private int age;
	private int height;
	private String name;
	private char gender;
	
	public void age(int age)
	{
	this.age=age;
	}
	public void height(int height)
	{
	this.height=height;
	}
	public void name(String name)
	{
	this.name=name;
	}
	public void gender(char gender)
	{
	this.gender=gender;
	}
	
}

class Building
{
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String area;
	private String name;
	public void name(String name)
	{
	this.name=name;
	}
	public void area(String area)
	{
	this.area=area;
	}
	
}




class Car
{
  public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

private String brand;
  private String color;
  private String name;
   
   public void name(String name)
	{
	this.name=name;
	}
   
   public void color(String color)
	{
	this.color=color;
	}
   
   public void brand(String brand)
	{
	this.brand=brand;
	}
}


