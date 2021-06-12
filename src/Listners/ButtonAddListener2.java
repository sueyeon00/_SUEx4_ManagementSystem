package Listners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.Cafe_adder;
import GUI.Place_Viewer;
import GUI.Res_adder;
import GUI.WindowFrame;

public class ButtonAddListener2 implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddListener2(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		Cafe_adder Cadder = frame.getCafeadder();
		frame.setupPanel(Cadder);

	}

} 
