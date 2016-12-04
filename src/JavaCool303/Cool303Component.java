package JavaCool303;

import javax.swing.JComponent;

public abstract class Cool303Component {
	protected Cool303Theme theme; 
	private JComponent component;
	 
	public Cool303Component(Cool303Theme aTheme, JComponent myComponent){
		this.theme = aTheme; 
		this.component = myComponent; 
	}
	
	public void supplyJComponent(JComponent c) {
		if (this.component == null) {
			this.component = c;
		}
	}
	
	protected JComponent getJComponent() {
		return this.component;
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
