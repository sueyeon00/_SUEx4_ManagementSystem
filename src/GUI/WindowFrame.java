package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import _SUEx4_ManagementSystem.Placemanager;

public class WindowFrame extends JFrame{
	Placemanager placemanager;
	
	Res_adder resadder;
	Cafe_adder cafeadder;
    Place_Viewer placeviewer;
	MenuSelection menuselection;
	
	
	public WindowFrame(Placemanager placemanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
	    this.placemanager = placemanager;
	    this.resadder = new Res_adder(this, this.placemanager);
	    this.cafeadder = new Cafe_adder(this, this.placemanager);
	    this.placeviewer = new Place_Viewer(this, this.placemanager);
		this.menuselection = new MenuSelection(this);

		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public Res_adder getResadder() {
		return resadder;
	}
	public void setResadder(Res_adder resadder) {
		this.resadder = resadder;
	}
	public Cafe_adder getCafeadder() {
		return cafeadder;
	}
	public void setCafeadder(Cafe_adder cafeadder) {
		this.cafeadder = cafeadder;
	}
	public Place_Viewer getPlaceviewer() {
		return placeviewer;
	}
	public void setPlaceviewer(Place_Viewer placeviewer) {
		this.placeviewer = placeviewer;
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


}
