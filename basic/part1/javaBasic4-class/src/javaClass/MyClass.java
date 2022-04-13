package javaClass;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "subhadip";
		p1.walk();
		p1.walk(500);
		
		Person p2 = new Person();
		p2.name= "Alex";
		p2.eat();
		
		Person p3 = new Person("sudip" , 25);
		p3.walk(500);
		
		
		System.out.println("Total number of persons are : "+Person.count);	

	}

}


class Person {
	String name;
	int age;
	
//	static is a variable , which is not associated with any object
//	it is associated with class
//	like the count property , 
//	it will increase every time we will make new object
	
	static int count = 0;
	
	
//	if not provide any constructor, Java will make default constructor
//	it is a function , when a object is created
//	to make constructor : Public  Class_name {}
	public Person() {
		count++;
		System.out.println("Person constructor is running , current person no : "+count);
	}
	
	
//	Constructor overload
	public Person(String name, int age) {
		this();  // this line said , run the base constructor first
		this.name = name;
		this.age = age;
	}
	
	
	
//	general method of a class
	
	void eat() {
		System.out.println("My name is : "+name);
	}
	
	
	
	
	
	
	
//	both function with same name , but different number of arguments
//	this is called Polymorphism
//	Polymorphism means : multiple forms
//	here the method walks has multiple forms
//	this Polymorphism is called compile time Polymorphism
	
	void walk() {
		System.out.println(name+" is Walking");
	}
	
	void walk(int step) {
		System.out.println(name+" is Walking and steps are : "+step);
	}
}
