package Cafe;

import java.util.Scanner;
//�б� ��ó�� ��ġ�� ����, �Ĺ����� ���� + ��Ÿ ǥ�� �ּ� 
public class Kind2cafe extends Cafe{
	
	public Kind2cafe(Cafekind kind) {
		super(kind);
   	}
	
	public void getUserInput(Scanner input) {	    
	    setcafeName(input);
	    
	    char answer ='x';
		while(answer != 'f' && answer != 'F' && answer != 'b' &&answer != 'B') {
			System.out.print("��ġ�� �����̳� �Ĺ��̳�?(F/B)");//���� = F, �Ĺ� = B
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
