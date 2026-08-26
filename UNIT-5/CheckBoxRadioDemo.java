import javax.swing.*;
public class CheckBoxRadioDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Check Box & Radio Example");
		
		JCheckBox cb1 = new JCheckBox("Java");
		JCheckBox cb2 = new JCheckBox("Python");
		
		//JRadioButton rb1 = new JRadioButton("Male");
		//JRadioButton rb2 = new JRadioButton("Female");
		
		ButtonGroup group = new ButtonGroup();
		//group.add(rb1);
		//group.add(rb2);
		
		/*JPanel panel = new JPanel();
		panel.add(cb1);
		panel.add(cb2);
		panel.add(rb1);
		panel.add(rb2);*/
		
		frame.add(cb1);
		frame.add(cb2);
		//frame.add(rb1);
		//frame.add(rb2);
		
		//frame.add(panel);
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}