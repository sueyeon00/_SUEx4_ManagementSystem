package _SUEx4_ManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner (System.in);
		Placemanager placemanager = new Placemanager(input);
		String ROC;    //res or cafe 
		int num = -1;
		while(num != 6) {
			System.out.println("-------------------");
			System.out.println("1. add restaurant ");
			System.out.println("2. add cafe");
			System.out.println("3. delete place");
			System.out.println("4. edit place");
			System.out.println("5. view places ");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			
			
			if( num < 1 || num > 6){
			    System.out.println("You should select one number between 1-6");
			    System.out.println();
			    continue;
			}
		
			else if(num == 1) {
				placemanager.Arestaurant();     
		    }
		    else if(num == 2) {
		    	placemanager.Acafe();
	    	}
		    else if(num == 3) {
		    	System.out.println(" res or cafe ? ");
		    	ROC = input.next();
		    	if (ROC.equals("res")) {
		    		placemanager.Rdelete();
		    	}
		    	if(ROC.equals("cafe")){
		    	    placemanager.Cdelete();
		        }
		    }
		    else if(num == 4) {
		    	System.out.println(" res or cafe ? ");
		    	ROC = input.next();
		    	if (ROC.equals("res")) {
		    		placemanager.Redit();
		    	}
		    	if(ROC.equals("cafe")){
		    	    placemanager.Cedit();
		        }
		    }
		    else if(num == 5) {
		    	System.out.println(" res or cafe ? ");
		    	ROC = input.next();
		    	if (ROC.equals("res")) {
		    		placemanager.Rviews();
		    	}
		    	if(ROC.equals("cafe")){
		    	    placemanager.Cviews();
		        }
		    }
 		    else if(num == 6) {
		    	break;
		    }  
		}
    }

}
