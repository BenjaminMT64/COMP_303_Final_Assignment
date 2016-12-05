package JavaCool303;

import java.awt.Component;

import javax.swing.JComponent;

public abstract class Cool303Component {
	protected Cool303Theme theme; 
	 
	public Cool303Component(Cool303Theme aTheme){
		this.theme = aTheme; 
		applyTheme();
	}
	
	protected Component getSwingComponent() {
		return null;
	}
	
	protected void setTheme(Cool303Theme selectedTheme){
		this.theme = selectedTheme; 
		applyTheme();
	}
	
	public abstract void applyTheme();
	
	/**
	 * @return the aTheme
	 */
	public Cool303Theme getTheme() {
		return theme;
	}

	

}
