package Restaruant;

import java.util.Scanner;

import exception.NumberfomatException;

public interface Res_Input {
	
	public void getUserInput(Scanner input);
	
	public String getName();
	
	public void setName(String name);
	
	public void setLocation(String location);
	
	public void setNumber(int number) throws NumberfomatException;
	
	public void setType(String type);
	
	public void setMainDish(String mainDish);
	
	public void printInfo();
	
	public void setResName(Scanner input);
	
	public void setResLocation(Scanner input);
	
	public void setResNumber(Scanner input);
	
	public void setResType(Scanner input);
	
	public void setResMain(Scanner input);
	

}
