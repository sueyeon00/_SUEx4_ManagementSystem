package Cafe;

import java.util.Scanner;
//학교 근처라서 위치는 정문, 후문으로 나뉨 + 기타 표현 주소 
public class Kind2cafe extends Cafe{
	
	public Kind2cafe(Cafekind kind) {
		super(kind);
   	}
	
	public void getUserInput(Scanner input) {	    
	    setcafeName(input);
	    
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
		setcafeNumber(input);
		setcafeMood(input);
		setcafeDessert(input);
	}
	public void printInfo() {
		String ckind = getKindString();
		System.out.println("*kind:" + ckind +"*name: "+ name + " *location: " + Location + 
				" *Number: " + number + " *Mood: "+ mood + " *Dessert: "+ Dessert);
	}


}
