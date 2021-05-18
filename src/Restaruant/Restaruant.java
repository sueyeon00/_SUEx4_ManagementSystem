package Restaruant;

import java.util.Scanner;

import exception.NumberfomatException;

public abstract class Restaruant implements Res_Input{
	
	protected Restaurantkind kind = Restaurantkind.kind1;  //kind1 이 기본
	protected String name;      //protected 는 자식 클래스에는 상속되는데 그 외 외부 클래스에선 접근 불가
	protected String Location;
	protected int number;
	protected String Type;
	protected String MainDish;    

	public Restaruant() {  //생성자
		
	}
    public Restaruant(Restaurantkind kind) {  //생성자
		this.kind = kind;
	}
	public Restaruant(String name, String Location, int number ,String Type, String main) {
		this.name = name;
		this.Location = Location;
		this.number = number;
		this.Type = Type;
		this.MainDish = main;
	}
	public Restaruant(Restaurantkind kind, String name, String Location, int number ,String Type, String main) {
		this.kind = kind;
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
	public void setNumber(int number) throws NumberfomatException{
		if(number <= 0) {
			throw new NumberfomatException();
		}
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
	
	public abstract void printInfo();
	
	public void setResName(Scanner input) {
		System.out.print("Restaurant name: ");
		String name = input.next();
		this.setName(name);
	}
	public void setResLocation(Scanner input) {
		System.out.print("Restaurant Location:");	
	    String Location = input.next();
	    this.setLocation(Location);
	}
	public void setResNumber(Scanner input) {
		int number = -1;
		while(number <= 0) {
			System.out.print("Restaurant Number: ");
		    number = input.nextInt();
		    try {
				this.setNumber(number);
			} catch (NumberfomatException e) {
				System.out.println("다시 입력하시오.");
			}
		}
	}
	public void setResType(Scanner input) {
		System.out.print("Type of food:");			    
	    String Type = input.next();
	    this.setType(Type);
	}
	public void setResMain(Scanner input) {
		System.out.print("Main Dish:");
		String MainDish = input.next();
	    this.setMainDish(MainDish);
	}
	public String getKindString() {
		String rkind = "none";
		switch(this.kind) {
		case kind1:
			rkind = "학교 밖";
			break;
		case kind2:
			rkind = "학교 근처";
			break;
		case kind3:
			rkind = "그 외";
			break;
		default:
		}
		return rkind;
	}
}
