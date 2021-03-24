package _SUEx4_ManagementSystem;
//진주 시내 가볼만한 식당, 카페, 장소 관리 프로그램
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
				restaurant();     
		    }
		    else if(num < 5) {
		    	cafe();
	    	}
		    else if(num == 5) {
		    	place();
		    }
 		    else if(num == 7) {
		    	System.out.println("나가고 싶니 그럼 아무 키나 눌러봐");
		    	String Exit = input.next();
		    	System.out.println("ㅃ2");
		    	break;
		    }  
		}
    }
	public static void restaurant() {
		Scanner input = new Scanner(System.in);
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
	public static void cafe() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cafe Name: ");
	    String CName = input.next();
	    System.out.print("Cafe Location:");
	    String CLocation = input.next();
	    System.out.print("Cafe Number: ");
	    int CNumber = input.nextInt();
	    System.out.print("Dessert:");
	    String Dessert = input.next();
	}
	public static void place() {
		Scanner input = new Scanner(System.in);
		System.out.print("Place name: ");
	    String PName = input.next();
	    System.out.print("Place Location:");
	    String PLocation = input.next();
	}

}
