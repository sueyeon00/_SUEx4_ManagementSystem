package Restaruant;

import java.util.Scanner;
//학교 근처라서 위치는 정문, 후문으로 나뉨 + 기타 표현 주소 
public class Kind2res extends Restaruant{
	
	public Kind2res(Restaurantkind kind) {  //생성자
		super(kind);
	}
	
	
	public void getUserInput(Scanner input) {
		setResName(input);
				
		char answer ='x';
		while(answer != 'f' && answer != 'F' && answer != 'b' &&answer != 'B') {
			System.out.print("위치가 정문이냐 후문이냐?(F/B)");//정문 = F, 후문 = B
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
