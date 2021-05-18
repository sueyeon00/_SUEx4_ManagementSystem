package Cafe;

import java.util.Scanner;

import exception.NumberfomatException;

public interface Cafe_Input {
	
	public void getUserInput(Scanner input);
	
	public String getName();
	
	public void setName(String name);
	
	public void setLocation(String location);
	
	public void setNumber(int number) throws NumberfomatException;
	
	public void setMood(String mood);
	
	public void setDessert(String dessert);
	
	public void printInfo();
	
	public void setcafeName(Scanner input);
	
	public void setcafeLocation(Scanner input);
	
	public void setcafeNumber(Scanner input);
	
	public void setcafeMood(Scanner input);
	
	public void setcafeDessert(Scanner input);

}
