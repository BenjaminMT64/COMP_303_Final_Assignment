// Aaron Gaba (Student ID: 260450580)
// Benjamin Taubenblatt (Student ID: 260626105)

package JavaCool303;
import java.awt.Component;

import javax.swing.JFrame;

/**
 * A Cool303Frame is a special wrapper around a JFrame that holds
 * and displays a single Cool303Box (which itself is a wrapper around
 * a JPanel).  Note that the Cool303Box displayed can contain nested
 * Cool303Boxes within it.
 * 
 */
public class Cool303Frame extends Cool303Component {
	private JFrame myWindow; 
	private Cool303Box frameBox;
	
	/**
	 * Constructs a new Cool303Frame 
	 * @param myTheme The theme to be applied to all components in the frame
	 * @param frameBox The top-level Cool303Box to be displayed
	 */
	public Cool303Frame(Cool303Theme myTheme, Cool303Box frameBox){ 
		super(myTheme);
		myWindow = new JFrame(); 
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameBox = frameBox;
		
		setFrameContents();
	}	
	
	private boolean isFrameAlreadyFilled() {
		return (this.myWindow.getContentPane().getComponentCount() == 1);
	}
	
	private void setFrameContents() {
		if (isFrameAlreadyFilled()) {
			this.myWindow.getContentPane().remove(0);
		} 
		
		this.myWindow.getContentPane().add(this.frameBox.getSwingComponent());
	}
	
	/**
	 * Sizes the underlying JFrame to properly view the Cool303Box and displays the window
	 */
	public void makeFrame(){
		myWindow.pack(); //sizes frame to scale content
		myWindow.setVisible(true); //set frame visibility 
	}
	
	protected Component getSwingComponent(){
		return this.myWindow;
	}
	
	@Override
	public void applyTheme() {
		//This method is left intentionally empty.
	}
	
	

}
