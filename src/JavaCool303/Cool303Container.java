package JavaCool303;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

public class Cool303Container extends Cool303Component{
	
	private String title;
	protected Container guiContainer = new Container();
	
	public Cool303Container(int rows, int cols, Cool303Theme theme){
		super(theme);
		guiContainer = new Container();
		guiContainer.setLayout(new GridLayout(rows, cols));
	}
	
	//To be implemented later
	//public Cool303Container(int rows, int cols, Cool303Theme theme, String name)
	
	public void addComponent(Cool303Component c, int row, int col) {
		c.setTheme(super.getTheme());
		this.guiContainer.add(c.getSwingComponent());
	}
	
	public void removeComponent(int index){
		this.guiContainer.remove(index);
	}
	
	public String getString(){
		return this.title;
	}
	
	public void setString(String containerTitle){
		this.title = containerTitle;
	}
	
	protected Component getSwingComponent(){
		return this.guiContainer;
	}
	
	@Override
	public void applyTheme() {
		// TODO Auto-generated method stub	
	}
	
}
