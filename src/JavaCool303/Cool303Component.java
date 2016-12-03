package JavaCool303;

import javax.swing.JComponent;

public abstract class Cool303Component {
	protected Cool303Theme aTheme; 
	private JComponent component;
	 
	public Cool303Component(Cool303Theme aTheme, JComponent myComponent){
		this.aTheme = aTheme; 
		this.component = myComponent; 
	}
	
	public void setTheme(Cool303Theme selectedTheme){
		this.aTheme = selectedTheme; 
	}
	
	/**
	 * @return the aTheme
	 */
	public Cool303Theme getaTheme() {
		return aTheme;
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

}
