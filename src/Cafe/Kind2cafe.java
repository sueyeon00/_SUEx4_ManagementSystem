package Cafe;

import java.util.Scanner;
//학교 근처라서 위치는 정문, 후문으로 나뉨 + 기타 표현 주소 
public class Kind2cafe extends Cafe {
	
	public Kind2cafe(Cafekind kind) {
		super(kind);
   	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Cafe Name: ");
	    String name = input.next();
	    this.setName(name);
	    
	    char answer ='x';
		while(answer != 'f' && answer != 'F' && answer != 'b' &&answer != 'B') {
			System.out.print("위치가 정문이냐 후문이냐?(F/B)");//정문 = F, 후문 = B
			answer = input.next().charAt(0);
			if(answer == 'f' || answer =='F') {
				System.out.println("Cafe Location : ");
				String Location = input.next();
				this.setLocation("F- " + Location);
				break;
			}
			else if(answer == 'b' || answer =='B') {
				System.out.println("Cafe Location : ");
				String Location = input.next();
				this.setLocation("B- " + Location);
				break;
			}
			else {
			}
		}
	    
	    
	    System.out.print("Cafe Number: ");
	    int number = input.nextInt();
	    this.setNumber(number);
	    
	    System.out.print("Mood: ");
	    String mood = input.next();
	    this.setMood(mood);
	    
	    System.out.print("Dessert:");
	    String dessert = input.next();
	    this.setDessert(dessert);
	}
	

}
