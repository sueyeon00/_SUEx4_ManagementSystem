package Cafe;

import java.util.Scanner;

public class Kind3cafe extends Cafe {
	
	public Kind3cafe(Cafekind kind) {
		super(kind);
   	}
	protected String Location_Area;
	
	public void getUserInput(Scanner input) {
		System.out.print("Cafe Name: ");
	    String name = input.next();
	    this.setName(name);
	    
	    System.out.print("지역 이름 (Area): ");
		String area = input.next();
		this.setLocation(area); 		
	    	    
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
