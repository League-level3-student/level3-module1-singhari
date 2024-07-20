package _06_Intro_To_Hash_Maps;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	
	   JButton add = new JButton("Add entry");  
	   JButton search = new JButton("Search by ID");
	   JButton view = new JButton("View List");
	  
	 
	 public void setup() {
		 JFrame f = new JFrame();
		  JPanel p = new JPanel();
		  add.addActionListener(this);
		  search.addActionListener(this);
		  view.addActionListener(this);
		  p.add(add);
		  p.add(search);
		  p.add(view);
		  
		 // p.add();
		  f.add(p);
		  f.pack();
		  f.setVisible(true);
	 }
	  
	 public static void main(String[] args){
		 _02_LogSearch l = new _02_LogSearch();
		 l.setup();
	  }
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add) {
			String idString = JOptionPane.showInputDialog("Pick an id number");
			int id = Integer.parseInt(idString);
			String name = JOptionPane.showInputDialog("Pick an name");
			log.put(id, name);
		}
		else if(e.getSource() == search) {
			String idString = JOptionPane.showInputDialog("Input ID number");
			int id = Integer.parseInt(idString);
			if(log.containsKey(id)) {
				JOptionPane.showMessageDialog(null, "The person you are looking for is: "+log.get(id));
			}
			else {
				
			}
		}
		else if(e.getSource() == view) {
			String list = "";
			for(int s : log.keySet()) {
				list+="ID: "+s+ "    Name: "+log.get(s)+"\n";
			}
			JOptionPane.showMessageDialog(null, list);
		}
	}
	  	
    /*
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with three buttons.
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list.
     */

}
