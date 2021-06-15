package Listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Cafe.CAfe_;
import Cafe.Cafe_Input;
import Cafe.Cafekind;
import _SUEx4_ManagementSystem.Placemanager;
import exception.NumberfomatException;

public class CafeAdderListener implements ActionListener {
	
	

	JTextField fieldN;
	JTextField fieldL;
	JTextField fieldNum;
	JTextField fieldM;
	JTextField fieldD;
	
	Placemanager placemanager;
	
	public CafeAdderListener(JTextField fieldN, JTextField fieldL, JTextField fieldNum, JTextField fieldM,
			JTextField fieldD, Placemanager placemanager) {
		super();
		this.fieldN = fieldN;
		this.fieldL = fieldL;
		this.fieldNum = fieldNum;
		this.fieldM = fieldM;
		this.fieldD = fieldD;
		this.placemanager = placemanager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldN.getText());
		System.out.println(fieldL.getText());
		System.out.println(fieldNum.getText());
		System.out.println(fieldM.getText());
		System.out.println(fieldD.getText());
		
		Cafe_Input cafe = new CAfe_(Cafekind.kind1);
		
		
		try {
			cafe.setName(fieldN.getText());
		    cafe.setLocation(fieldL.getText());
			cafe.setNumber(Integer.parseInt(fieldNum.getText()));
			cafe.setMood(fieldM.getText());
		    cafe.setDessert(fieldD.getText());
		    placemanager.Acafe(cafe);
		    putObject(placemanager, "placemanager.ser");
			cafe.printInfo();
		} catch (NumberFormatException | NumberfomatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	 public static void putObject(Placemanager placemanager, String filename) {
			try {
				FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(file);
				
				out.writeObject(placemanager);
				
				out.close();
				file.close();
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
