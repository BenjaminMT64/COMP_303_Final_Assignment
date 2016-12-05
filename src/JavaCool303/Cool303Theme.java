package JavaCool303;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.border.Border; 


public class Cool303Theme {
	private Color boxColor;
	private Border boxBorder;
	
	private Color componentColor;
	private Border componentBorder;
	private Font componentFont;
	
	private Font titleFont;
	
	public Cool303Theme(Color boxColor, Border boxBorder, Color componentColor, Border componentBorder,
			Font componentFont, Font titleFont) {
		this.boxColor = boxColor;
		this.boxBorder = boxBorder;
		this.componentColor = componentColor;
		this.componentBorder = componentBorder;
		this.componentFont = componentFont;
		this.titleFont = titleFont;
	}

	/**
	 * @return the boxColor
	 */
	public Color getBoxColor() {
		return boxColor;
	}

	/**
	 * @return the boxBorder
	 */
	public Border getBoxBorder() {
		return boxBorder;
	}

	/**
	 * @return the componentColor
	 */
	public Color getComponentColor() {
		return componentColor;
	}

	/**
	 * @return the componentBorder
	 */
	public Border getComponentBorder() {
		return componentBorder;
	}

	/**
	 * @return the componentFont
	 */
	public Font getComponentFont() {
		return componentFont;
	}

	/**
	 * @return the titleFont
	 */
	public Font getTitleFont() {
		return titleFont;
	}

	

}
