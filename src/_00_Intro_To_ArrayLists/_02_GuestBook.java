package _00_Intro_To_ArrayLists;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class _02_GuestBook implements ActionListener{
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	//JFrame frame;
//	JLabel lab;
	ArrayList<String> nameList = new ArrayList<String>();
	JButton addNames;
	JButton viewNames;
	String input;
	JFrame frame;
	JLabel lab;
	int frameWidth = 500;
	int frameHeight = 500;
	
	public static void main(String[] args) {
//		JFrame frame = new JFrame();
//		JLabel lab = new JLabel();
//		addNames = new JButton("Add Names");
//		viewNames = new JButton("View Names");
//		lab.add(addNames);
//		lab.add(viewNames);
//		frame.add(lab);
//		frame.pack();
		_02_GuestBook gb = new _02_GuestBook();
		gb.setup();
		
	}
	
	public void setup() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(frameWidth, frameHeight));
		lab = new JLabel();
//	setPreferredSize(new Dimension(frameWidth, frameHeight));
		addNames = new JButton("Add Names");
		viewNames = new JButton("View Names");
		frame.setVisible(true);
		addNames.setVisible(true);
		viewNames.setVisible(true);
		lab.add(addNames);
		lab.add(viewNames);
		frame.add(lab);
		frame.pack();
	//nameList = new ArrayList<String>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int k = 0;
		if(e.getSource() == addNames) {
		input = "";
		input = JOptionPane.showInputDialog(input);
		nameList.add(input);
		}
		else if(e.getSource() == viewNames) {
			for(String name : nameList) {
				input = "Guest " + k+": "+name + "\n";
			}
			JOptionPane.showMessageDialog(null, input);
		}
	}
	
	
}
