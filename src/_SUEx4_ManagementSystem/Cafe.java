package _SUEx4_ManagementSystem;

public class Cafe {
	String name;
	String Location;
	int number;
	String mood;
	String Dessert;
	
	
    public Cafe() {
		
	}
	public Cafe(String name, String Location, String mood, int number) {
		this.name = name;
		this.Location = Location;
		this.mood = mood;
		this.number = number;
	
	}
	public void printInfo() {
		System.out.println();
		System.out.println("***Cafe***");
		System.out.println("*name: "+ name + " *location: " + Location +
				" *Number: "+ number + " *Mood: "+ mood + " *Dessert: "+ Dessert);
	}

}
