package Restaruant;

import java.util.Scanner;
//�б� ��ó�� ��ġ�� ����, �Ĺ����� ���� + ��Ÿ ǥ�� �ּ� 
public class Kind2res extends Restaruant {
	
	public Kind2res(Restaurantkind kind) {  //������
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Restaurant Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer ='x';
		while(answer != 'f' && answer != 'F' && answer != 'b' &&answer != 'B') {
			System.out.print("��ġ�� �����̳� �Ĺ��̳�?(F/B)");//���� = F, �Ĺ� = B
			answer = input.next().charAt(0);
			if(answer == 'f' || answer =='F') {
				System.out.println("Restaurant Location : ");
				String Location = input.next();
				this.setLocation("F- " + Location);
				break;
			}
			else if(answer == 'b' || answer =='B') {
				System.out.println("Restaurant Location : ");
				String Location = input.next();
				this.setLocation("B- " + Location);
				break;
			}
			else {
			}
		}
		
		
	    System.out.print("Restaurant Number: ");
	    int number = input.nextInt();
	    this.setNumber(number);
	    
	    System.out.print("Type of food:");			    
	    String Type = input.next();
	    this.setType(Type);
	    
	    System.out.print("Main Dish:");
	    String main = input.next();
	    this.setMainDish(main);
	}

}
