package _SUEx4_ManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		Placemanager placemanager = new Placemanager(input);
		
		selectMenu(input, placemanager);
			
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
					break;
				case 2:
					placemanager.Acafe();
					break;
				case 3: 
					System.out.println(" res or cafe ? ");
					ROC = input.next();
					if (ROC.equals("res")) {
						placemanager.Rdelete();
					}
					if(ROC.equals("cafe")){
						placemanager.Cdelete();
					}
					break;
				case 4:
					System.out.println(" res or cafe ? ");
					ROC = input.next();
					if (ROC.equals("res")) {
						placemanager.Redit();
					}
					if(ROC.equals("cafe")){
						placemanager.Cedit();
					}
					break;
				case 5:
					System.out.println(" res or cafe ? ");
					ROC = input.next();
					if (ROC.equals("res")) {
						placemanager.Rviews();
					}
					if(ROC.equals("cafe")){
						placemanager.Cviews();
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

}
