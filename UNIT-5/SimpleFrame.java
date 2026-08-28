import javax.swing.*;
public class SimpleFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("My First Swing Frame");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
