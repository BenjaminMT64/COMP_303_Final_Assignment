package JavaCool303;

import java.awt.Color;
import java.awt.Component; 
import java.awt.Dimension;
import java.awt.GridLayout; 
import javax.swing.BorderFactory; 
import javax.swing.JPanel;
import javax.swing.border.TitledBorder; 

public class cool303Box {
	private JPanel box;
	private String aTitle;
	private int rows;
	private int cols; 
	private int width;
	private int height; 
	private cool303Theme aTheme; 
	private List<cool303Component> displayableComponents;
	
	//NOTE add optional constructors
	public cool303Box(cool303Theme aTheme, int rows, int cols){
		this.aTheme = aTheme;
		this.rows = rows;
		this.cols = cols;		
	}
	
	public cool303Box(cool303Theme aTheme, int rows, int cols, String aTitle){
		this.aTheme = aTheme;
		this.rows = rows;
		this.cols = cols;	
		this.aTitle = aTitle; 
	}
	
	public cool303Box(cool303Theme aTheme, int rows, int cols, String aTitle, int width, int height){
		this.aTheme = aTheme;
		this.rows = rows;
		this.cols = cols;	
		this.aTitle = aTitle; 
		this.width = width;
		this.height = height; 
	}
	
	public cool303Box(cool303Theme aTheme, String aTitle, int rows, int cols, int width, int height){
		this.box = new JPanel(); 
		this.aTheme = aTheme; 
		this.aTitle = aTitle; 		
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
	
	protected void add(cool303Component x){
		super.add(x);
		box.add(x.getSwingComponent());
	}
	
	public Component getSwingComponent(){
		return box;
	}
}
