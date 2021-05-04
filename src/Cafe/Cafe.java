package Cafe;

import java.util.Scanner;

public class Cafe {
	
	protected Cafekind kind = Cafekind.kind1;
	protected String name;
	protected String Location;
	protected int number;
	protected String mood;
	protected String Dessert;
    public Cafe() {
		
	}
    public Cafe(Cafekind kind) {
		this.kind = kind;
   	}
	public Cafe(String name, String Location, int number, String mood, String dessert) {
		this.name = name;
		this.Location = Location;
		this.number = number;
		this.mood = mood;
		this.Dessert = dessert;
	}
	public Cafe(Cafekind kind, String name, String Location, int number, String mood, String dessert) {
		this.kind = kind;
		this.name = name;
		this.Location = Location;
		this.number = number;
		this.mood = mood;
		this.Dessert = dessert;
	}
	//getters and setters
	public Cafekind getKind() {
		return kind;
	}
	public void setKind(Cafekind kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getMood() {
		return mood;
	}
	public void setMood(String mood) {
		this.mood = mood;
	}
	public String getDessert() {
		return Dessert;
	}
	public void setDessert(String dessert) {
		Dessert = dessert;
	}
	public void printInfo() {
		String ckind = "none";
		switch(this.kind) {
		case kind1:
			ckind = "학교 밖";
			break;
		case kind2:
			ckind = "학교 근처";
			break;
		case kind3:
			ckind = "그 외";
			break;
		default:
			
		}
		System.out.println("*kind:" + ckind +"*name: "+ name + " *location: " + Location + 
				" *Number: " + number + " *Mood: "+ mood + " *Dessert: "+ Dessert);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Cafe Name: ");
	    String name = input.next();
	    this.setName(name);
	    
	    System.out.print("Cafe Location:");
	    String Location = input.next();
	    this.setLocation(Location);
	    
	    System.out.print("Cafe Number: ");
	    int number = input.nextInt();
	    this.setNumber(number);
	    
	    System.out.print("Mood: ");
	    String mood = input.next();
	    this.setMood(mood);
	    
	    System.out.print("Dessert:");
	    String dessert = input.next();
	    this.setDessert(dessert);
	}

}
