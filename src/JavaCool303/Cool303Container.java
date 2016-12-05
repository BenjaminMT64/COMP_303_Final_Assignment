package JavaCool303;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Cool303Container extends Cool303Component{
	
	private String title;
	protected Container guiContainer = new Container();
	private Cool303Theme containerTheme;
	
	public Cool303Container(int rows, int cols, Cool303Theme theme){
		super(theme);
		guiContainer = new Container();
	}

	//To be implemented later
	//public Cool303Container(int rows, int cols, Cool303Theme theme, String name)
	
	public void addComponent(Cool303Component c, int row, int col) {
		c.setTheme(this.containerTheme);
		this.guiContainer.add(c.getSwingComponent());
	}
	
	public String getString(){
		return this.title;
	}
	
	protected Container setContainer(Cool303Container a){
		this.guiContainer = (Container) a.getSwingComponent();
	}
	
	protected Component getSwingComponent(){
		return this.guiContainer;
	}
	
	public void setString(String containerTitle){
		this.title = containerTitle;
	}

	@Override
	public void applyTheme() {
		// TODO Auto-generated method stub
		
	}
	
}
