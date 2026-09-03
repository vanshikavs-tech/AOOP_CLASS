import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SW1_FirstSwingApp{
	public static void main(String[] args){
		
		//Step-1: Create Frame
		JFrame frame = new JFrame("Student Form");
		frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		//Step-2: Create components
		JLabel nameLabel = new JLabel("Name:");
		JTextField nameField = new JTextField(15);
		JButton saveButton = new JButton("Save");
		
		//Step-3: Add components
		frame.add(nameLabel);
		frame.add(nameField);
		frame.add(saveButton);
		
		//Step-4: Add event handling
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name=nameField.getText(); 
				System.out.println("Saved:"+name);
			}
		});
		
		//Step-5: Make it visible at last
		frame.setVisible(true);
		
		
	}
}