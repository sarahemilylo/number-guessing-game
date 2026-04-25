/* Create a simple geany clone, that can open up a file for reading, read the contents using BufferedReader, 
and put that file's contents in a JTextArea.  Conversly, if you save, use PrintWriter to write the JTextArea 
contents to a specified text file.   Bonus:   Use JFileChooser to choose where you want to save/open your file.

*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class guihw1 implements MenuListener{
	// Properties
	// Panel
	JFrame theFrame = new JFrame("Geany");
	JPanel thePanel = new JPanel();
	// Menu Bar
	JMenuBar theMenuBar = new JMenuBar();
	JMenu theFileMenu = new JMenu("File");
	JMenu theOpenItem = new JMenu("Open");
	JMenu theSaveItem = new JMenu("Save");
	
	// Methods
	public void menuSelected(MenuEvent evt){
		if(evt.getSource() == theOpenItem) {
			theArea. append("OPEN FILE\n");
	}
	public void menuDeselected(MenuEvent evt){
		
		
	}
	public void menuCanceled(MenuEvent evt){
		
	}
	
	// Constructor
	public guihw1(){
		// Set Panel
		thePanel.setLayout(null);
		thePanel.setPreferredSize(new Dimension(1280, 720));
		
		// Menu Bar
		theMenuBar.add(theFileMenu);
		theFileMenu.add(theOpenItem);
		theFileMenu.add(theSaveItem);
		
		// Set Frame
		theFrame.setContentPane(thePanel);
		theFrame.setJMenuBar(theMenuBar);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.pack();
		theFrame.setVisible(true);
		
	} 
	
	// Main Program
	public static void main(String[] args){
		new guihw1();
	}
	
}
