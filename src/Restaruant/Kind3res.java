package Restaruant;

import java.util.Scanner;
//그 외
public class Kind3res extends Restaruant{
	
	public Kind3res(Restaurantkind kind) {  //생성자
		super(kind);
	}
	
	protected String Location_Area; 
	
	public void getUserInput(Scanner input) {
		setResName(input);
		
		setResLocation(input);
		
		setResNumber(input);
		
		setResType(input);
		
		setResMain(input);
	}
	
	public void printInfo() {
		String rkind = getKindString();
		System.out.println("*kind:" + rkind +"*name: "+ name + " *location: " + Location + 
				" *Number: " + number + " *Type: "+ Type + " *MainDish: "+ MainDish);
	}
	
}
