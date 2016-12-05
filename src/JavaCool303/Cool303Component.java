package JavaCool303;

import java.awt.Component;

import javax.swing.JComponent;

public abstract class Cool303Component extends JComponent{
	protected Cool303Theme theme; 
	 
	public Cool303Component(Cool303Theme aTheme){
		this.theme = aTheme; 
		//this.component = myComponent; 
	}
	
	protected Component getSwingComponent() {
		return null;
	}
	
	public void setTheme(Cool303Theme selectedTheme){
		this.theme = selectedTheme; 
	}
	
	public abstract void applyTheme();
	
	/**
	 * @return the aTheme
	 */
	public Cool303Theme getTheme() {
		return theme;
	}

	

}
