package Cafe;

import java.util.Scanner;
//�б� ��ó�� ��ġ�� ����, �Ĺ����� ���� + ��Ÿ ǥ�� �ּ� 
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
