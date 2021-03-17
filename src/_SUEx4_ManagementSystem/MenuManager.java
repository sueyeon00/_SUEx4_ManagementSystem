package _SUEx4_ManagementSystem;
//진주 내에 있는 가볼만한 식당과 카페 관리 리스트
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args)
	{
		int num = 0;
		Scanner input = new Scanner (System.in);
		
		while(num != 7) {
			System.out.println("1. A delicious restaurant ");
			System.out.println("2. An atmospheric restaurant");
			System.out.println("3. A pretty cafe");
			System.out.println("4. Delicious cafe");
			System.out.println("5. A famous place");
			System.out.println("6. Show a menu");
			System.out.println("7. Exit");
			System.out.println("Select one number between 1-7:");
			num = input.nextInt();
			
			
			if( num < 1 || num > 7){
			    System.out.println("You should select one number between 1-7");
			    System.out.println();
			    continue;
			}
		
			else if(num < 3) {
                    System.out.print("Restaurant Name: ");
		    String RName = input.next();
		    System.out.print("Restaurant Location:");			    
		    String RLocation = input.next();
		    System.out.print("Restaurant Number: ");
		    int RNumber = input.nextInt();
		    System.out.print("Type of food:");			    
		    String TOF = input.next();
		    System.out.print("Main Dish:");
		    String MainDish = input.next();
			    
			    
		    }
		    else if(num < 5) {
		    	System.out.print("Cafe Name: ");
			    String CName = input.next();
			    System.out.print("Cafe Location:");
			    String CLocation = input.next();
			    System.out.print("Cafe Number: ");
			    int CNumber = input.nextInt();
			    System.out.print("Dessert:");
			    String Dessert = input.next();
			    
	    	}
		    else if(num == 6) {
		    	continue;
		    }
		    else if(num == 7) {
		    	break;
		    }    
		    else if( num < 1 || num > 7){
			    System.out.println("You should select one number between 1-7");
			    System.out.println();
			    continue;
			
		    }
        }

    }

}
