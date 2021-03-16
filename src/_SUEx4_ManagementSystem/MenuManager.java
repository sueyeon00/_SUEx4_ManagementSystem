package _SUEx4_ManagementSystem;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args)
	{
		int num = 0;
		Scanner input = new Scanner (System.in);
		
		while(num != 6) {
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. View Students");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
		
		    if(num == 1) {
			    System.out.print("Student Id:");
			    int studentId = input.nextInt();
			    System.out.print("Studend Name:");
			    String studentName = input.next();
			    System.out.print("Studend E-mail address:");
			    String studentEAddress = input.next();
			    System.out.print("Studend phone number:");
			    int studentPNumber = input.nextInt();
		    }
		    else if(num<5) {
			    System.out.print("Student Id:");
			    int studentId = input.nextInt();
	    	}
		    else if(num == 5) {
		    	continue;
		    }
		    else if(num == 6) {
		    	break;
		    }    
		    else {
			    System.out.println("You should select one number between 1-6");
			    System.out.println();
			    continue;
			
		    }
        }

    }

}
