package Restaruant;

import java.util.Scanner;
//그 외
public class Kind3res extends Restaruant {
	
	public Kind3res(Restaurantkind kind) {  //생성자
		super(kind);
	}
	
	protected String Location_Area; 
	
	public void getUserInput(Scanner input) {
		System.out.print("Restaurant Name: ");
		String name = input.next();
		this.setName(name);

		System.out.print("지역 이름 (Area): ");
		String area = input.next();
		this.setLocation(area);
		
		
	    System.out.print("Restaurant Number: ");
	    int number = input.nextInt();
	    this.setNumber(number);
	    
	    System.out.print("Type of food:");			    
	    String Type = input.next();
	    this.setType(Type);
	    
	    System.out.print("Main Dish:");
	    String main = input.next();
	    this.setMainDish(main);
	}
}
