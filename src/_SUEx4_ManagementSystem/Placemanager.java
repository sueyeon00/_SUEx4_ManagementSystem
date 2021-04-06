package _SUEx4_ManagementSystem;

import java.util.Scanner;

public class Placemanager {
	Restaruant res;
	Cafe cafe;
	Scanner input;
	
	Placemanager(Scanner input){
		this.input = input;
	}
	
	public void restaurant() {
		res = new Restaruant();
		System.out.print("Restaurant Name: ");
	    res.name = input.next();
	    System.out.print("Restaurant Location:");			    
	    res.Location = input.next();
	    System.out.print("Restaurant Number: ");
	    res.number = input.nextInt();
	    System.out.print("Type of food:");			    
	    res.Type = input.next();
	    System.out.print("Main Dish:");
	    res.MainDish = input.next();
	}
	public void cafe() {
		cafe = new Cafe();
		System.out.print("Cafe Name: ");
	    cafe.name = input.next();
	    System.out.print("Cafe Location:");
	    cafe.Location = input.next();
	    System.out.print("Cafe Number: ");
	    cafe.number = input.nextInt();
	    System.out.print("Mood: ");
	    cafe.mood = input.next();
	    System.out.print("Dessert:");
	    cafe.Dessert = input.next();
	}
	public void Rdelete() {
		System.out.print("Place name: ");
	    String Name = input.next();
	   if(res== null){
	    	System.out.println("the restaruant not registered");
	    	return;
	    }
	    if(res.name.equals(Name)) {
	    	res = null;
	    	System.out.println("the restaruant is deleted");
	    }
	}
	public void Cdelete() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    if(cafe == null) {
	    	System.out.println("the cafe not registered");
	    	return;
	    }           
	    if(cafe.name.equals(Name)) {
	    	cafe = null;
	    	System.out.println("the cafe is deleted");
	    }
	}
	public void Redit() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    if(res.name.equals(Name) ) {
	    	System.out.println("the restaurant to be edited is "+"<"+ Name +">");
	    } 
	}
	public void Cedit() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    if(cafe.name.equals(Name)) {
	    	System.out.println("the cafe to be edited is "+"<"+ Name +">");
	    }
	}
	public void Rview() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    if(res== null) {
	    	System.out.println("다시 ");
	    	return;           
	    }
	    if(res.name.equals(Name)) {
	    	res.printInfo();
	    }
	 }
	public void Cview() {
		System.out.print("Place name: ");
	    String Name = input.next();
	    if(cafe == null) {
	    	System.out.println("다시 ");
	    	return;  
	    }
	    if(cafe.name.equals(Name)) {
	    	cafe.printInfo();
	    }
	}
	    
}
