package Cafe;

import java.io.Serializable;
import java.util.Scanner;

import exception.NumberfomatException;

public abstract class Cafe implements Cafe_Input, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5230751173188381691L;
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
	public void setNumber(int number) throws NumberfomatException{
		if(number <= 0) {
			throw new NumberfomatException();
		}
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
	public abstract void printInfo();
	
	public void setcafeName(Scanner input) {
		System.out.print("Cafe name: ");
		String name = input.next();
		this.setName(name);
	}
	public void setcafeLocation( Scanner input) {
		System.out.print("Cafe Location: ");
		String name = input.next();
		this.setName(name);
	}
	public void setcafeNumber(Scanner input) {
		int number = -1;
		while(number <= 0) {
			System.out.print("Cafe Number: ");
		    number = input.nextInt();
		    try {
				this.setNumber(number);
			} catch (NumberfomatException e) {
				System.out.println("다시 입력하시오.");
			}
		}
	}
	public void setcafeMood(Scanner input) {
		System.out.print("Cafe mood: ");
		String name = input.next();
		this.setName(name);
	}
	public void setcafeDessert( Scanner input) {
		System.out.print("Cafe dessert: ");
		String name = input.next();
		this.setName(name);
	}
	public String getKindString() {
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
		return ckind;
	}

}
