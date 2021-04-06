package _SUEx4_ManagementSystem;

public class Restaruant {
	String name;
	String Location;
	int number;
	String Type;
	String MainDish;

	public Restaruant() {
		
	}
	public Restaruant(String name, String Location, String Type, int number) {
		this.name = name;
		this.Location = Location;
		this.Type = Type;
		this.number = number;
	
	}
	public void printInfo() {
		System.out.println("***Restaruant***");
		System.out.println("*name: "+ name + " *location: " + Location + 
				" *Number: " + number + " *Type: "+ Type + " *MainDish: "+ MainDish);
	}
}
