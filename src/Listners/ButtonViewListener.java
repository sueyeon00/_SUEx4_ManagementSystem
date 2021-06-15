package Listners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.Place_Viewer;
import GUI.WindowFrame;
import _SUEx4_ManagementSystem.Placemanager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Place_Viewer placeviewer = frame.getPlaceviewer();
		Placemanager placemanager = getObject("placemanager.ser");
		placeviewer.setPlacemanager(placemanager); //
		
//		JButton b = (JButton)e.getSource();
//		Place_Viewer viewer = frame.getPlaceviewer();
//		frame.setupPanel(viewer);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(placeviewer);
		frame.revalidate();
		frame.repaint();

	}
	public static Placemanager getObject(String filename) {
		Placemanager placemanager = null;
		
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			placemanager = (Placemanager) in.readObject();
			
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return placemanager;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return placemanager;
		
	}

} 
