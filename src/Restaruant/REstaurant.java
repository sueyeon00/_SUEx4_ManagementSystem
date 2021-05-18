package Restaruant;

import java.util.Scanner;

public class REstaurant extends Restaruant{
	
	public REstaurant(Restaurantkind kind) {  //»ı¼ºÀÚ
		super(kind);
	}
	
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
