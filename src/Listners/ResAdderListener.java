package Listners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Restaruant.REstaurant;
import Restaruant.Res_Input;
import Restaruant.Restaurantkind;
import _SUEx4_ManagementSystem.Placemanager;
import exception.NumberfomatException;

public class ResAdderListener implements ActionListener {
	
	

	JTextField fieldN;
	JTextField fieldL;
	JTextField fieldNum;
	JTextField fieldT;
	JTextField fieldM;
	
	Placemanager placemanager;

	public ResAdderListener(JTextField fieldN, JTextField fieldL, JTextField fieldNum, JTextField fieldT,
			JTextField fieldM, Placemanager placemanager) {
		super();
		this.fieldN = fieldN;
		this.fieldL = fieldL;
		this.fieldNum = fieldNum;
		this.fieldT = fieldT;
		this.fieldM = fieldM;
		this.placemanager = placemanager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(fieldN.getText());
//		System.out.println(fieldL.getText());
//		System.out.println(fieldNum.getText());
//		System.out.println(fieldT.getText());
//		System.out.println(fieldM.getText());
		
		Res_Input res = new REstaurant(Restaurantkind.kind1);
	    
	    try {
	    	
	    	res.setName(fieldN.getText());
	        res.setLocation(fieldL.getText());
			res.setNumber(Integer.parseInt(fieldNum.getText()));
			res.setType(fieldT.getText());
	        res.setMainDish(fieldM.getText());
	        placemanager.Arestaurant(res);
	        putObject(placemanager, "placemanager.ser");
	        res.printInfo();
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
