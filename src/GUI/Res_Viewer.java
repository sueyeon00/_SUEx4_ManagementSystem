package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Res_Viewer extends JFrame {
	public Res_Viewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("name");
		model.addColumn("location");
		model.addColumn("number");
		model.addColumn("info");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
