package JavaCool303;
import javax.swing.JFrame;

public class cool303Frame {
	private JFrame myWindow; 
	private cool303Box aBox;
	
	public cool303Frame(){ 
		myWindow = new JFrame(); 
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.pack(); //sizes frame to scale content
		myWindow.setVisible(true); //set frame visibility 
	}	

}
