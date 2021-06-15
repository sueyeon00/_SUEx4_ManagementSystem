 package Listners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.Place_Viewer;
import GUI.Res_adder;
import GUI.WindowFrame;

public class PlaceAdderCancleListener implements ActionListener {
	
	WindowFrame frame;

	public PlaceAdderCancleListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton)e.getSource();
//		Res_adder Radder = frame.getResadder();
//		frame.setupPanel(Radder);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();

	}

} 
