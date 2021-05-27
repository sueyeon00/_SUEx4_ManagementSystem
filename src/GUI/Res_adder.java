package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Res_adder extends JFrame {
	
	public Res_adder() {
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
		
		
		JLabel labelT = new JLabel("Type: ", JLabel.TRAILING);
		JTextField fieldT = new JTextField(10);
		labelT.setLabelFor(fieldT);
		panel.add(labelT);
		panel.add(fieldT);
		
		
		JLabel labelM = new JLabel("Main Dish: ", JLabel.TRAILING);
		JTextField fieldM = new JTextField(10);
		labelM.setLabelFor(fieldM);
		panel.add(labelM);
		panel.add(fieldM);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setContentPane(panel);
		this.setVisible(true);
	}
	
	

}
