package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	
	public MenuSelection() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label = new JLabel("Menu Selection");
		
		JButton B1 = new JButton("add restaurant");
		JButton B2 = new JButton("add cafe");
		JButton B3 = new JButton("delete place");
		JButton B4 = new JButton("edit place");
		JButton B5 = new JButton("view place");
		JButton B6 = new JButton("EXIT");
		
		
		
		panel1.add(label);
		panel2.add(B1);
		panel2.add(B2);
		panel2.add(B3);
		panel2.add(B4);
		panel2.add(B5);
		panel2.add(B6);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	
		this.setVisible(true);
		
	}

}
