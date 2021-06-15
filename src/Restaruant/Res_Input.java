package Restaruant;

import java.util.Scanner;

import javax.swing.JTextField;

import exception.NumberfomatException;

public interface Res_Input {
	
	public void getUserInput(Scanner input);
	
	public String getName();
	
	public void setName(String string);
	
	public String getLocation();
	public void setLocation(String string);
	
	public int getNumber();
	public void setNumber(int number) throws NumberfomatException;
	
	public String getType();
	public void setType(String string);
	
	public String getMainDish();
	public void setMainDish(String string);
	
	public void printInfo();
	
	public void setResName(Scanner input);
	
	public void setResLocation(Scanner input);
	
	public void setResNumber(Scanner input);
	
	public void setResType(Scanner input);
	
	public void setResMain(Scanner input);



	

}
