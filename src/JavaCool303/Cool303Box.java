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
	private int rows;
	private int cols; 
	private int width;
	private int height; 
	private Cool303Theme aTheme; 
	
	private ArrayList<Cool303Component> displayableComponents;
	
//	public cool303Box(cool303Theme aTheme, int rows, int cols){
//		this.aTheme = aTheme;
//		this.rows = rows;
//		this.cols = cols;		
//	}
	
	public Cool303Box(Cool303Theme aTheme, int rows, int cols, int width, int height){
		super(aTheme, width, height);
		this.box = new JPanel(); 
		this.aTheme = aTheme; 
		this.rows = rows;
		this.cols = cols;
		this.width = width;
		this.height = height;
		box.setLayout(new GridLayout(rows,cols));
		box.setBackground(Color.blue);
		setBoxSize(width,height);		
	}
	
	//set size and check min requirements
	private void setBoxSize(int width, int height){
		if(box.getMinimumSize().width <= width && box.getMinimumSize().height <= height){ //if minimum size requirements 
			Dimension size = new Dimension(); 
			size.setSize(width, height); //set dimension size
			box.setSize(size); //setting box dimension
		}
	}
	
	public void addComponent(Cool303Component c){
		c.setTheme(this.aTheme);
		displayableComponents.add(c);		
	}
	
	public void removeAtIndex(int i){
		displayableComponents.remove(i);
	}
	
	public Cool303Component getComp(int i){
		
		return displayableComponents.get(i);
	}
	
	public void setTheme(Cool303Theme selectedTheme){
		this.aTheme = selectedTheme; 
	}
	
	/**
	 * @return the box
	 */
	public JPanel getBox() {
		return box;
	}

	/**
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * @return the cols
	 */
	public int getCols() {
		return cols;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the aTheme
	 */
	public Cool303Theme getaTheme() {
		return aTheme;
	}

	/**
	 * @return the displayableComponents
	 */
	public ArrayList<Cool303Component> getDisplayableComponents() {
		return displayableComponents;
	}

}
