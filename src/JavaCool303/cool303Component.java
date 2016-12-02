package JavaCool303;

public abstract class Cool303Component {
	protected Cool303Theme aTheme; 
	private int width;
	private int height; 
	
	public Cool303Component(Cool303Theme aTheme, int width, int height){
		this.aTheme = aTheme; 
		this.width = width; 
		this.height = height; 
	}
	
	public Cool303Component(){}
	
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
