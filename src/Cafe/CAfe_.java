package Cafe;

import java.util.Scanner;

public class CAfe_ extends Cafe{
	
	public CAfe_(Cafekind kind) {
		super(kind);
	}
	

	public void getUserInput(Scanner input) {
		setcafeName(input);
		setcafeLocation(input);
		setcafeNumber(input);
		setcafeMood(input);
		setcafeDessert(input);

	}
	
	public void printInfo() {
		String ckind = getKindString();
		System.out.println("*kind:" + ckind +"*name: "+ name + " *location: " + Location + 
				" *Number: " + number + " *Mood: "+ mood + " *Dessert: "+ Dessert);
	}


}
