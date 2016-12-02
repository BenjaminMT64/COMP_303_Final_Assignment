package JavaCool303;
import java.awt.Color;
import java.awt.Font;

public class Cool303Winter{
	protected Color bgColor; 
	protected Color borderColor; 
	protected Color titleColor;
	protected Font titleFont; 
	protected String icon; //NOTE do we need a getIcon? isn't it just the path to the icon which we place in our libe?
	
	public Cool303Winter(Color bgColor, Color borderColor, Color titleColor, Font titleFont, String icon){
		this.bgColor = bgColor; 
		this.borderColor = borderColor;
		this.titleColor = titleColor;
		this.titleFont = titleFont; 
		this.icon = icon; 
	}
	
	public Color getBgColor() {
		return bgColor;
	}
	public Color getBorderColor() {
		return borderColor;
	}
	public Color getTitleColor() {
		return titleColor;
	}
	public Font getTitleFont() {
		return titleFont;
	}
	public String getIcon() {
		return icon;
	}

}




