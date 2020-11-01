/*
*Animal Shelter project
*Author: Agnieszka Karlowska
* 20.10.2020
*/

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;


public class AnimalShelter{

private static final String addString = "Add pet";
private static final String removeString = "Remove pet";

   public static void main (String[] args){
         JOptionPane.showMessageDialog(null,"Welcome User","Animal Shelter Manager",JOptionPane.INFORMATION_MESSAGE);
   
   	// Create a JFrame
 	JFrame frame = new JFrame("Animal Shelter Manager");

	FlowLayout layout = new FlowLayout(FlowLayout.LEFT,10,20);
 	frame.setLayout(layout);

	// Create and add labels, text fields and buttons to the frame.
	frame.add(new JLabel("Enter Pet's Name: "));
	JTextField petName=new JTextField(10);
 	frame.add(petName); // space for 10 characters to be entered
 	frame.add(new JLabel("Enter Pet's Category: "));
	JTextField petCategory=new JTextField(10);
 	frame.add(petCategory); // space for 10 characters to be entered
	// Create a JButton object
 	JButton jbtSubmit = new JButton("Submit");
 	frame.add(jbtSubmit);
 	frame.add(new JButton("Exit"));

	//Create a listModel object
	String[] names={"one","two","three"};
	JList<String> listModel = new JList<String>(names);
	listModel.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	listModel.setLayoutOrientation(JList.HORIZONTAL_WRAP);
	listModel.setVisibleRowCount(-1);
	JScrollPane listScrollPane = new JScrollPane(listModel);
	listModel.setSelectedIndex(0);
	//listModel.addListSelectionListener(this);
        //list.setVisibleRowCount(5);
       // JScrollPane listScrollPane = new JScrollPane(listModel);


        //create a panel 
        JScrollPane p =new JScrollPane(); 
 p.add(new JLabel("List of pets: "));
p.add(listModel);
frame.add(p);
 p.setBackground(Color.white);

p.setBounds(10,10,250,100);
 
 // Set the frame size
 frame.setSize(250,410); // 250 pixels wide and 410 pixels high
 // Centre the frame
 frame.setLocationRelativeTo(null);
 // Close the frame upon exit
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
 // Display the frame
 frame.setVisible(true);

jbtSubmit.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
      String getPetName = petName.getText();
	String getPetCategory=petCategory.getText();

   }
});




	}// main

}// class