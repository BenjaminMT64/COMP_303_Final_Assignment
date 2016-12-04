package JavaCool303;

import javax.swing.JComponent;

public abstract class Cool303Component {
	protected Cool303Theme theme; 
	//private JComponent component;
	 
	public Cool303Component(Cool303Theme aTheme){
		this.theme = aTheme; 
		//this.component = myComponent; 
	}
	
	protected JComponent getSwingComponent() {
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
