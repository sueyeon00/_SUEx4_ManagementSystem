package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Cafe.Cafe_Input;
import Restaruant.Res_Input;
import _SUEx4_ManagementSystem.Placemanager;

public class Place_Viewer extends JPanel {
	
	WindowFrame frame;
	Placemanager placemanager;
	
	public Place_Viewer(WindowFrame frame, Placemanager placemanager) {
		this.frame = frame;
		this.placemanager = placemanager;
		
		System.out.println("*** "+ placemanager.size1()+" ***");
		System.out.println("*** "+ placemanager.size2()+" ***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("name");
		model.addColumn("location");
		model.addColumn("number");
		model.addColumn("info1");
		model.addColumn("info2");
		
		DefaultTableModel mode2 = new DefaultTableModel();
		mode2.addColumn("name");
		mode2.addColumn("location");
		mode2.addColumn("number");
		mode2.addColumn("info1");
		mode2.addColumn("info2");
		
		for(int i = 0; i < placemanager.size1(); i++) {
			Vector row = new Vector();
			Res_Input resinput = placemanager.get1(i);
			row.add(resinput.getName());
			row.add(resinput.getLocation());
			row.add(resinput.getNumber());
			row.add(resinput.getType());
			row.add(resinput.getMainDish());
			model.addRow(row);
			
		}
		for(int i = 0; i < placemanager.size2(); i++) {
			Vector row1 = new Vector();
			Cafe_Input cafeinput = placemanager.get(i);
			row1.add(cafeinput.getName());
			row1.add(cafeinput.getLocation());
			row1.add(cafeinput.getNumber());
			row1.add(cafeinput.getMood());
			row1.add(cafeinput.getDessert());
			mode2.addRow(row1);
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

	}

}
