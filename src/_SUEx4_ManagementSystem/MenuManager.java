package _SUEx4_ManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args)
	{
		
		
		Scanner input = new Scanner (System.in);
		Placemanager placemanager = getObject("placemanager.ser");
		if(placemanager == null) {
			placemanager = new Placemanager(input);
		}
		
		selectMenu(input, placemanager);
		putObject(placemanager, "placemanager.ser");
		
			
    }
	public static void selectMenu(Scanner input, Placemanager placemanager) {
		String ROC;    //res or cafe 
		int num = -1;
		while(num != 6) {
			try {
				showMenu();
			
				num = input.nextInt();
			
				switch(num) {
				case 1:
					placemanager.Arestaurant();
					logger.log("add a restaurant");
					break;
				case 2:
					placemanager.Acafe();
					logger.log("add a cafe");
					break;
				case 3: 
					System.out.println(" res or cafe ? ");
					ROC = input.next();
					if (ROC.equals("res")) {
						placemanager.Rdelete();
						logger.log("delete a restaurant");
					}
					if(ROC.equals("cafe")){
						placemanager.Cdelete();
						logger.log("delete a cafe");
					}
					break;
				case 4:
					System.out.println(" res or cafe ? ");
					ROC = input.next();
					if (ROC.equals("res")) {
						placemanager.Redit();
						logger.log("edit a restaurant");
					}
					if(ROC.equals("cafe")){
						placemanager.Cedit();
						logger.log("edit a cafe");
					}
					break;
				case 5:
					System.out.println(" res or cafe ? ");
					ROC = input.next();
					if (ROC.equals("res")) {
						placemanager.Rviews();
						logger.log("view a restaurant list");
					}
					if(ROC.equals("cafe")){
						placemanager.Cviews();
						logger.log("view a cafe list");
					}
					break;
				case 6:
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1-6 사이의 숫자를 입력하시오.");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
			
		}
	}
	public static void showMenu() {
		System.out.println("-------------------");
		System.out.println("1. add restaurant ");
		System.out.println("2. add cafe");
		System.out.println("3. delete place");
		System.out.println("4. edit place");
		System.out.println("5. view places ");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6:");
		
	}
	public static Placemanager getObject(String filename) {
		Placemanager placemanager = null;
		
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			placemanager = (Placemanager) in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return placemanager;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return placemanager;
		
	}
	public static void putObject(Placemanager placemanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(placemanager);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
