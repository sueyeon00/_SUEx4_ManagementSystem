package Cafe;

import java.util.Scanner;

public class Kind3cafe extends Cafe{
	
	public Kind3cafe(Cafekind kind) {
		super(kind);
   	}
	protected String Location_Area;
	
	public void getUserInput(Scanner input) {
		setcafeName(input);
		
		System.out.print("���� �̸� (Area): ");
		String area = input.next();
		this.setLocation(area); 
		
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
