package JavaCool303;
import javax.swing.JFrame;

public class Cool303Frame {
	private JFrame myWindow; 
	private Cool303Box aBox;
	
	public Cool303Frame(){ 
		myWindow = new JFrame(); 
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	public void makeFrame(){
		myWindow.pack(); //sizes frame to scale content
		myWindow.setVisible(true); //set frame visibility 
	}
	
	public void add(Cool303Box b){
		aBox = b; 

	}
	
	

}
