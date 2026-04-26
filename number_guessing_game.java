// Simple Number Guessing Game
// Guess a number between 1 to 100

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class number_guessing_game implements ActionListener{
	// Properties
	JFrame theFrame = new JFrame("Number Guessing Game");
	JPanel thePanel = new JPanel();
	JLabel theTitle = new JLabel("Number Guessing Game");
	JTextField theGuess = new JTextField();
	JLabel theLabel = new JLabel();
	int intNumber = (int)(Math.random() * 100 + 1); // number btw 1 to 100
	int intGuesses = 0;
	JLabel numGuesses = new JLabel();
	JButton theReset = new JButton("Reset"); 
	
	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == theReset){
			intGuesses = 0;
			intNumber = (int)(Math.random() * 100 + 1);
			numGuesses.setText("Your guesses: " + intGuesses);
			theGuess.setText("");
			theLabel.setText("");
		}else{
			try{
				int intGuess = Integer.parseInt(theGuess.getText()); 
				intGuesses += 1;
				
				if(intGuess > intNumber){
					theLabel.setText("Too HIGH");
				}else if(intGuess < intNumber){
					theLabel.setText("Too LOW");
				}else{
					theLabel.setText("You got it! The number was: " + intNumber);
				}
				theGuess.setText("");
				numGuesses.setText("Your guesses: " + intGuesses);
			}
			catch(NumberFormatException e){
				theLabel.setText("Error: enter a valid number");
				theGuess.setText("");
			}
		}
	}
	
	// Constructor
	public number_guessing_game(){
		// Set Panel
		thePanel.setLayout(null);
		thePanel.setPreferredSize(new Dimension(800, 500));
		
		// Add Title
		theTitle.setSize(400, 100);
		theTitle.setLocation(325, 10);
		thePanel.add(theTitle);
		
		// Add TextField
		theGuess.setSize(400, 50);
		theGuess.setLocation(40, 100);
		theGuess.addActionListener(this);
		thePanel.add(theGuess);
		
		// Add Hint
		theLabel.setSize(400, 30);
		theLabel.setLocation(560, 90);
		thePanel.add(theLabel); 
		
		// Add Number of Guesses
		numGuesses.setSize(400, 30);
		numGuesses.setLocation(560, 125);
		thePanel.add(numGuesses); 
		
		// Add Reset Button
		theReset.setSize(100, 30);
		theReset.setLocation(350, 200);
		theReset.addActionListener(this);
		thePanel.add(theReset);
		
		// Set Frame
		theFrame.setContentPane(thePanel);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.pack();
		theFrame.setVisible(true);
		
	} 
	
	// Main Program
	public static void main(String[] args){
		new number_guessing_game();
	}
	
}
