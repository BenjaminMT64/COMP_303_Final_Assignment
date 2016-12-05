package JavaCool303;

import java.awt.Color;
import java.awt.Component; 
import java.awt.Dimension;
import java.awt.GridLayout; 
import javax.swing.JPanel;
import javax.swing.border.Border;


public class Cool303Box extends Cool303Container {
	private JPanel box; 
	
	public Cool303Box(Cool303Theme aTheme, int rows, int cols){
		super(rows, cols, aTheme);
		box = new JPanel(new GridLayout(rows, cols, 5, 5)); 
		this.guiContainer = box;	
		applyTheme();
	}
	
	//set size and check min requirements
	public void setBoxSize(int width, int height){
		
		if((box.getMinimumSize().width <= width) && (box.getMinimumSize().height <= height)){ 
			Dimension newBoxSize = new Dimension(); 
			newBoxSize.setSize(width, height); //set dimension size
			box.setSize(newBoxSize); //setting box dimension
		}
	}
	
	public Dimension getBoxSize() {
		return box.getSize();
	}
	
	public void applyTheme(){
		if (theme.getBoxColor() != null) {
			this.box.setBackground(theme.getBoxColor());
		}
		
		if (theme.getBoxBorder() != null) {
			this.box.setBorder(theme.getBoxBorder());
		}
	}

	/**
	 * @return the box
	 */
	public JPanel getBox() {
		return this.box;
	}
	
	@Override
	protected Component getSwingComponent() {
		return this.box;
	}

}
