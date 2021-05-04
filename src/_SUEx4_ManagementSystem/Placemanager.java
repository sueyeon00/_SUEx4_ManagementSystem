package _SUEx4_ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

import Cafe.Cafe;
import Cafe.Cafekind;
import Restaruant.Kind2res;
import Restaruant.Kind3res;
import Restaruant.Restaruant;
import Restaruant.Restaurantkind;

public class Placemanager {
	ArrayList<Restaruant> restaruants = new ArrayList<Restaruant>();
	ArrayList<Cafe> cafes = new ArrayList<Cafe>();
	Scanner input; 
	Restaruant res = new Restaruant();  ////edit 에서 res.set();해주려고 만듦
	Cafe cafe = new Cafe();             ////
	Placemanager(Scanner input){
		this.input = input;
	}
	
	public void Arestaurant() {
		int kind =0;
		Restaruant res;
		while(kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 --> 학교 밖");
			System.out.println("2 --> 학교 근처 ");
			System.out.println("3 --> 그 외 ");
			System.out.print("Select 1 , 2 or 3 !! ");
			kind = input.nextInt();
			if( kind == 1) {
				res = new Restaruant(Restaurantkind.kind1);
				res.getUserInput(input);
				restaruants.add(res);            //리스트에 추가됨
				break;
			}
			else if( kind == 2) {
				res = new Kind2res(Restaurantkind.kind2);
				res.getUserInput(input);
				restaruants.add(res);            //리스트에 추가됨
				break;
			}
			else if( kind == 3) {
				res = new Kind3res(Restaurantkind.kind3);
				res.getUserInput(input);
				restaruants.add(res);            //리스트에 추가됨
				break;
			}
			else {
				System.out.print("Select 1 , 2 or 3 !! ");
			}
		}
			    
	}
	public void Acafe() {
		int kind = 0;
		Cafe cafe;
		while(kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 --> 학교 밖");
			System.out.println("2 --> 학교 근처 ");
			System.out.println("3 --> 그 외 ");
			System.out.print("Select 1 , 2 or 3 !! ");
			kind = input.nextInt();
			if( kind == 1) {
				cafe = new Cafe(Cafekind.kind1);
				cafe.getUserInput(input);
				cafes.add(cafe);            //리스트에 추가됨
				break;
			}
			else if( kind == 2) {
				cafe = new Cafe(Cafekind.kind2);
				cafe = new Cafe();
				cafe.getUserInput(input);
				cafes.add(cafe);            //리스트에 추가됨
				break;
				
			}
			else if( kind == 3) {
				cafe = new Cafe(Cafekind.kind3);
				cafe = new Cafe();
				cafe.getUserInput(input);
				cafes.add(cafe);            //리스트에 추가됨
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
	    int index = -1;
	    for( int i = 0; i<restaruants.size(); i++) {
	    	if(restaruants.get(i).getName().equals(Name)) {
		    	index = i;
		    	break;
		    }
	    }
	    if(index >= 0) {
	    	restaruants.remove(index);
	    	System.out.println("the restaruant <"+ Name+ "> is deleted");
	    }
	    else
	    	System.out.println("the restaruant not registered");
	    	return;
	    }
	    
	
	public void Cdelete() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    int index = -1;
	    for( int i = 0; i < cafes.size(); i++) {
	    	if(cafes.get(i).getName().equals(Name)) {
	    		index = i;
	    		break;
	    	}
	    }
	    	
	    if(index >= 0) {
	    	cafes.remove(index);
	    	System.out.println("the cafe <" + Name +"> is deleted");
	    	return;
	    }           
	    else
	    	System.out.println("the cafe not registered");
	    return;
	    };
	
	public void Redit() { 
		System.out.print("Place name: ");
	    String Name = input.next();
	    for( int i = 0; i<restaruants.size(); i++){
	    	if(restaruants.get(i).getName().equals(Name)) {
	    		int num = -1;
	    		while(num != 6) {
		    		System.out.println("*** Restaurant Info Edit Menu ***");
		    		System.out.println(" 1. Edit name");
		    		System.out.println(" 2. Edit location");
		    		System.out.println(" 3. Edit number");
		    		System.out.println(" 4. Edit type");
		    		System.out.println(" 5. Edit maindish");
		    		System.out.println(" 6. Exit");
		    		num = input.nextInt();
		    		if(num == 1) {
		    			System.out.print("Restaurant name: ");
		    			String name = input.next();
		    			res.setName(name);
		    		}
		    		else if( num == 2) {
		    			System.out.print("Restaurant Location:");	
		    		    String Location = input.next();
		    		    res.setLocation(Location);
		    		}
		    		else if( num == 3) {
		    			System.out.print("Restaurant Number: ");
		    		    int number = input.nextInt();
		    		    res.setNumber(number);
		    		}
		    		else if( num == 4) {
		    			System.out.print("Type of food:");			    
		    		    String Type = input.next();
		    		    res.setType(Type);
		    		}
		    		else if( num == 5) {
		    			System.out.print("Main Dish:");
		    			String MainDish = input.next();
		    		    res.setMainDish(MainDish);
		    		}
		    		else {
		    			continue;
		    		}//if
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
	    	if(cafes.get(i).getName().equals(Name)) {
	    		int num = -1;
	    		while(num != 6) {
		    		System.out.println("*** Cafe Info Edit Menu ***");
		    		System.out.println(" 1. Edit name");
		    		System.out.println(" 2. Edit location");
		    		System.out.println(" 3. Edit number");
		    		System.out.println(" 4. Edit mood");
		    		System.out.println(" 5. Edit dessert");
		    		System.out.println(" 6. Exit");
		    		num = input.nextInt();
		    		if(num == 1) {
		    			System.out.print("Restaurant name: ");
		    			String name = input.next();
		    			cafe.setName(name);
		    		}
		    		else if( num == 2) {
		    			System.out.print("Restaurant Location:");			    
		    		    String Location = input.next();
		    		    cafe.setLocation(Location);
		    		}
		    		else if( num == 3) {
		    			System.out.print("Restaurant Number: ");
		    		    int number = input.nextInt();
		    		    cafe.setNumber(number);
		    		}
		    		else if( num == 4) {
		    			System.out.print("Type of mood:");			    
		    		    String mood = input.next();
		    		    cafe.setMood(mood);
		    		}
		    		else if( num == 5) {
		    			System.out.print("dessert:");
		    		    String Dessert = input.next();
		    		    cafe.setDessert(Dessert);
		    		}
		    		else {
		    			continue;
		    		}//if
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
	    
}
