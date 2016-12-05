package JavaCool303;

import java.awt.Color;
import java.awt.Component; 
import java.awt.Dimension;
import java.awt.GridLayout; 
import javax.swing.BorderFactory; 
import javax.swing.JPanel;
import javax.swing.border.TitledBorder; 
import java.util.*; 

public class Cool303Box extends Cool303Container {
	private JPanel box;
	//private Cool303Theme aTheme; 
	private GridLayout myLayout = new GridLayout(5,4);
	
//	public cool303Box(cool303Theme aTheme, int rows, int cols){
//		this.aTheme = aTheme;
//		this.rows = rows;
//		this.cols = cols;		
//	}
	
	public Cool303Box(Cool303Theme aTheme, int rows, int cols){
		super(rows, cols, aTheme);
		box = new JPanel(new GridLayout(rows, cols)); 
		this.guiContainer = box;	
	}
	
	
	//set size and check min requirements
	private void setBoxSize(int width, int height){
		if(box.getMinimumSize().width <= width && box.getMinimumSize().height <= height){ //if minimum size requirements 
			Dimension size = new Dimension(); 
			size.setSize(width, height); //set dimension size
			box.setSize(size); //setting box dimension
		}
	}
	
//	public void addComponent(Cool303Component c){
//		c.setTheme(super.getTheme());
//		box.add(c.getSwingComponent());
//		//c.setTheme(this.aTheme);		
//	}
	
//	public void removeAtIndex(int i){
//		displayableComponents.remove(i);
//	}
//	
//	public Cool303Component getComp(int i){
//		
//		return displayableComponents.get(i);
//	}
	
//	public void setTheme(Cool303Theme selectedTheme){
//		this.aTheme = selectedTheme; 
//	}
	
	/**
	 * @return the box
	 */
	public JPanel getBox() {
		return this.box;
	}

//	/**
//	 * @return the rows
//	 */
//	public int getRows() {
//		return rows;
//	}
//
//	/**
//	 * @return the cols
//	 */
//	public int getCols() {
//		return cols;
//	}
//
//	/**
//	 * @return the width
//	 */
//	public int getWidth() {
//		return width;
//	}
//
//	/**
//	 * @return the height
//	 */
//	public int getHeight() {
//		return height;
//	}

//	/**
//	 * @return the aTheme
//	 */
//	public Cool303Theme getTheme() {
//		return aTheme;
//	}

}
