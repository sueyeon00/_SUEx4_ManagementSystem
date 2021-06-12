package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Listners.ButtonAddListener;
import Listners.ButtonAddListener2;
import Listners.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label = new JLabel("Menu Selection");
		
		JButton B1 = new JButton("add restaurant");
		JButton B2 = new JButton("add cafe");
		JButton B3 = new JButton("delete place");
		JButton B4 = new JButton("edit place");
		JButton B5 = new JButton("view place");
		JButton B6 = new JButton("EXIT");
		
		B1.addActionListener(new ButtonAddListener(frame));
		B2.addActionListener(new ButtonAddListener2(frame));
		B5.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(B1);
		panel2.add(B2);
		panel2.add(B3);
		panel2.add(B4);
		panel2.add(B5);
		panel2.add(B6);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	

		
	}

}
