package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Cafe_adder extends JFrame {
	
	public Cafe_adder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelN = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldN = new JTextField(10);
		labelN.setLabelFor(fieldN);
		panel.add(labelN);
		panel.add(fieldN);
		
		
		JLabel labelL = new JLabel("Location: ", JLabel.TRAILING);
		JTextField fieldL = new JTextField(10);
		labelL.setLabelFor(fieldL);
		panel.add(labelL);
		panel.add(fieldL);
		
		
		JLabel labelNum = new JLabel("Number: ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		panel.add(labelNum);
		panel.add(fieldNum);
		
		
		JLabel labelM = new JLabel("Mood: ", JLabel.TRAILING);
		JTextField fieldM = new JTextField(10);
		labelM.setLabelFor(fieldM);
		panel.add(labelM);
		panel.add(fieldM);
		
		
		JLabel labelD = new JLabel("Dessert: ", JLabel.TRAILING);
		JTextField fieldD = new JTextField(10);
		labelD.setLabelFor(fieldD);
		panel.add(labelD);
		panel.add(fieldD);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setContentPane(panel);
		this.setVisible(true);
	}
	
	

}
