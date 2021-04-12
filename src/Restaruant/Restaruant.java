package Restaruant;

import java.util.Scanner;

public class Restaruant {
	
	protected Restaurantkind kind = Restaurantkind.kind1;  //kind1 �� �⺻
	protected String name;      //protected �� �ڽ� Ŭ�������� ��ӵǴµ� �� �� �ܺ� Ŭ�������� ���� �Ұ�
	protected String Location;
	protected int number;
	protected String Type;
	protected String MainDish;    

	public Restaruant() {  //������
		
	}
	public Restaruant(String name, String Location, int number ,String Type, String main) {
		this.name = name;
		this.Location = Location;
		this.number = number;
		this.Type = Type;
		this.MainDish = main;
	}
	//getters and setters
	public Restaurantkind getKind() {
		return kind;
	}
	public void setKind(Restaurantkind kind) {
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
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getMainDish() {
		return MainDish;
	}
	public void setMainDish(String mainDish) {
		MainDish = mainDish;
	}
	public void printInfo() {
		System.out.println("*name: "+ name + " *location: " + Location + 
				" *Number: " + number + " *Type: "+ Type + " *MainDish: "+ MainDish);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Restaurant Name: ");
		String name = input.next();
		this.setName(name);
		
	    System.out.print("Restaurant Location:");	
	    String Location = input.next();
	    this.setLocation(Location);
	    
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
