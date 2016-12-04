package JavaCool303;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Cool303Container extends Cool303Component{
	
	private String title;
	private JPanel container = new JPanel();
	private Cool303Theme containerTheme;
	
	public Cool303Container(int rows, int cols, Cool303Theme theme){
		super(theme, null);
		container = new JPanel(new GridLayout(rows, cols));
		supplyJComponent(container);
		this.containerTheme = theme;
	}

	//To be implemented later
	//public Cool303Container(int rows, int cols, Cool303Theme theme, String name)
	
	public void addComponent(Cool303Component c, int row, int col) {
		c.setTheme(this.containerTheme);
		this.container.add(c.getJComponent());
	}
	
	public String getString(){
		return this.title;
	}
	
	public void setString(String containerTitle){
		this.title = containerTitle;
	}

	@Override
	public void applyTheme() {
		// TODO Auto-generated method stub
		
	}
	
}
