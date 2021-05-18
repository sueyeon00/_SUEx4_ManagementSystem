package _SUEx4_ManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Cafe.CAfe_;
import Cafe.Cafe;
import Cafe.Cafe_Input;
import Cafe.Cafekind;
import Cafe.Kind2cafe;
import Cafe.Kind3cafe;
import Restaruant.Kind2res;
import Restaruant.Kind3res;
import Restaruant.REstaurant;
import Restaruant.Res_Input;
import Restaruant.Restaruant;
import Restaruant.Restaurantkind;

public class Placemanager {
	ArrayList<Res_Input> restaruants = new ArrayList<Res_Input>();
	ArrayList<Cafe_Input> cafes = new ArrayList<Cafe_Input>();
	Scanner input; 

	Placemanager(Scanner input){
		this.input = input;
	}
	
	public void Arestaurant() {
		int kind =0;
		Res_Input resinput;
		while(kind != 1 && kind != 2 && kind != 3) {
			try {
				System.out.println("1 --> 학교 밖");
				System.out.println("2 --> 학교 근처 ");
				System.out.println("3 --> 그 외 ");
				System.out.print("Select 1 , 2 or 3 !! ");
				kind = input.nextInt();
				if( kind == 1) {
					resinput = new REstaurant(Restaurantkind.kind1);
					resinput.getUserInput(input);
					restaruants.add(resinput);            //리스트에 추가됨
					break;
				}
				else if( kind == 2) {
					resinput = new Kind2res(Restaurantkind.kind2);
					resinput.getUserInput(input);
					restaruants.add(resinput);            //리스트에 추가됨
					break;
				}
				else if( kind == 3) {
					resinput = new Kind3res(Restaurantkind.kind3);
					resinput.getUserInput(input);
					restaruants.add(resinput);            //리스트에 추가됨
					break;
				}
				else {
					System.out.print("Select 1 , 2 or 3 !! ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1-3 사이의 숫자를 입력하시오.");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
			
		}
			    
	}
	public void Acafe() {
		int kind = 0;
		Cafe_Input cafeinput;
		while(kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 --> 학교 밖");
			System.out.println("2 --> 학교 근처 ");
			System.out.println("3 --> 그 외 ");
			System.out.print("Select 1 , 2 or 3 !! ");
			kind = input.nextInt();
			if( kind == 1) {
				cafeinput = new CAfe_(Cafekind.kind1);
				cafeinput.getUserInput(input);
				cafes.add(cafeinput);            //리스트에 추가됨
				break;
			}
			else if( kind == 2) {
				cafeinput = new Kind2cafe(Cafekind.kind2);
				cafeinput.getUserInput(input);
				cafes.add(cafeinput);            //리스트에 추가됨
				break;
				
			}
			else if( kind == 3) {
				cafeinput = new Kind3cafe(Cafekind.kind3);
				cafeinput.getUserInput(input);
				cafes.add(cafeinput);            //리스트에 추가됨
				break;
			}
			else {
				System.out.print("Select 1 , 2 or 3 !! ");
			}
		}
		
	}
	    
	public void Rdelete() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    int index = findIndex(Name);
	    remove_Restaurant(index, Name);
	}
	
	public int remove_Restaurant(int index, String Name) {
		if(index >= 0) {
	    	restaruants.remove(index);
	    	System.out.println("the restaruant <"+ Name+ "> is deleted");
	    }
	    else
	    	System.out.println("the restaruant not registered");
	    	return -1;
	}
	    
	public void Cdelete() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    int index = findIndex(Name);
	    remove_Cafe(index, Name);
	}
	public int remove_Cafe(int index, String Name) {
		if(index >= 0) {
	    	cafes.remove(index);
	    	System.out.println("the cafe <" + Name +"> is deleted");
	    }           
	    else
	    	System.out.println("the cafe not registered");
	    return -1;
	}
	
	public int findIndex(String Name) {
		int index = -1;
		for( int i = 0; i<restaruants.size(); i++) {
	    	if(restaruants.get(i).getName().equals(Name)) {
		    	index = i;
		    	break;
	    	}
		}
		return index;
	}
	public void Redit() { 
		System.out.print("Place name: ");
	    String Name = input.next();
	    for( int i = 0; i<restaruants.size(); i++){
	    	Res_Input resinput = restaruants.get(i);
	    	if(restaruants.get(i).getName().equals(Name)) {
	    		int num = -1;
	    		while(num != 6) {
	    			showEditMenu_R();
		    		num = input.nextInt();
		    		switch(num) {
		    		case 1:
		    			resinput.setResName(input);
		    			break;
		    		case 2:
		    			resinput.setResLocation(input);
		    			break;
		    		case 3:
		    			resinput.setResNumber(input);
		    			break;
		    		case 4:
		    			resinput.setResType(input);
		    			break;
		    		case 5:
		    			resinput.setResMain(input);
		    			break;
		    		default:
		    			continue;
		    		}
	    		}//while
	    		System.out.println("the restaurant to be edited is "+"<"+ Name +">");
	    		break;
	    	}//if
	    }//for
	    
	    } 
	
	public void Cedit() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    for( int i = 0; i<cafes.size(); i++){
	    	Cafe_Input cafeinput = cafes.get(i);
	    	if(cafes.get(i).getName().equals(Name)) {
	    		int num = -1;
	    		while(num != 6) {
	    			showEditMenu_C();
		    		num = input.nextInt();
		    		switch(num) {
		    		case 1:
		    			cafeinput.setcafeName(input);
		    			break;
		    		case 2:
		    			cafeinput.setcafeLocation(input);
		    			break;
		    		case 3:
		    			cafeinput.setcafeNumber(input);
		    			break;
		    		case 4:
		    			cafeinput.setcafeMood(input);
		    			break;
		    		case 5:
		    			cafeinput.setcafeDessert(input);
		    			break;
		    		default:
		    			continue;
		    		}
	    		}//while
	    		System.out.println("the cafe to be edited is "+"<"+ Name +">");
	    		break;
	    	}//if
	    }//for	
	}
	public void Rviews() {
		System.out.println("of resistered restaruants : "+restaruants.size() );
		System.out.println("***Restaruant***");
	    for( int i = 0; i<restaruants.size(); i++) {
	    	restaruants.get(i).printInfo();
	    }
	 }
	public void Cviews() {
		System.out.println("of resistered cafes : "+ cafes.size());
		System.out.println("***Cafe***");
	    for( int i = 0; i < cafes.size(); i++) {
	    	cafes.get(i).printInfo();
	    }
	}
	
	
	
	
	
	public void showEditMenu_R() {
		System.out.println("*** Restaurant Info Edit Menu ***");
		System.out.println(" 1. Edit name");
		System.out.println(" 2. Edit location");
		System.out.println(" 3. Edit number");
		System.out.println(" 4. Edit type");
		System.out.println(" 5. Edit maindish");
		System.out.println(" 6. Exit");
	}
	public void showEditMenu_C() {
		System.out.println("*** Cafe Info Edit Menu ***");
		System.out.println(" 1. Edit name");
		System.out.println(" 2. Edit location");
		System.out.println(" 3. Edit number");
		System.out.println(" 4. Edit mood");
		System.out.println(" 5. Edit dessert");
		System.out.println(" 6. Exit");
	}
	
	
	    
}
