package Restaruant;

import java.util.Scanner;
//�б� ��ó�� ��ġ�� ����, �Ĺ����� ���� + ��Ÿ ǥ�� �ּ� 
public class Kind2res extends Restaruant{
	
	public Kind2res(Restaurantkind kind) {  //������
		super(kind);
	}
	
	
	public void getUserInput(Scanner input) {
		setResName(input);
				
		char answer ='x';
		while(answer != 'f' && answer != 'F' && answer != 'b' &&answer != 'B') {
			System.out.print("��ġ�� �����̳� �Ĺ��̳�?(F/B)");//���� = F, �Ĺ� = B
			answer = input.next().charAt(0);
			if(answer == 'f' || answer =='F') {
				setResLocation(input);
				break;
			}
			else if(answer == 'b' || answer =='B') {
				setResLocation(input);
			}
			else {
			}
		}
		
        setResNumber(input);
		
		setResType(input);
		
		setResMain(input);
	}
	
	public void printInfo() {
		String rkind = getKindString();
		System.out.println("*kind:" + rkind +"*name: "+ name + " *location: " + Location + 
				" *Number: " + number + " *Type: "+ Type + " *MainDish: "+ MainDish);
	}

}
