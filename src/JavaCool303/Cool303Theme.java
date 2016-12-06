// Aaron Gaba (Student ID: 260450580)
// Benjamin Taubenblatt (Student ID: 260626105)

package JavaCool303;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder; 

/**
 * A Cool303Theme is a collection of two styles:
 *  -A style for boxes (i.e., Cool303Boxes), whereupon we can style the background and the border
 *  -A style for non-container components (e.g., Cool303Button), whereupon we can style
 *   the component's background, border, and any text it might display
 */
public class Cool303Theme {
	private Color boxColor;
	private Border boxBorder;
	
	private Color componentColor;
	private Border componentBorder;
	private Font componentFont;
	
	private Font titleFont;
	
	/**
	 * Constructs a new Cool303Theme.  For any attribute not provided, Cool303 will revert to 
	 * the default attribute provided by the Swing Look-and-Feel in use.
	 * @param boxColor Background color for all Cool303Boxes
	 * @param boxBorder Border (style) for all Cool303Boxes
	 * @param componentColor Background color for all non-container Cool303Components
	 * @param componentBorder Border (style) for all non-container Cool303Components
	 * @param componentFont Font for all non-container Cool303Components
	 * @param titleFont
	 */
	public Cool303Theme(Color boxColor, Border boxBorder, Color componentColor, Border componentBorder,
			Font componentFont, Font titleFont) {
		this.boxColor = boxColor;
		this.boxBorder = boxBorder;
		this.componentColor = componentColor;
		this.componentBorder = componentBorder;
		this.componentFont = componentFont;
		this.titleFont = titleFont;
	}
	
	/*
	 * This special null constructor for a Cool303Theme sets the theme to be the 'Pascal' theme.
	 */
	public Cool303Theme(){
		this.setPastelTheme();
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
	
	/**
	 * Overwrites the current theme and sets it to be the built-in 'winter' theme
	 */
	public void setPastelTheme() {		
		this.boxColor = new Color(220, 237, 193);
		this.boxBorder = new RoundedBorder(10);
		this.componentColor = new Color(244, 154, 194);
		this.componentBorder = new RoundedBorder(10);
		this.componentFont = new Font("Monospaced", Font.ITALIC, 14);
		this.titleFont = new Font("Monospaced", Font.BOLD, 14);
	}
	
	/**
	 * Overwrites the current theme and sets it to be the built-in 'winter' theme
	 */
	public void setWinterTheme() {		
		this.boxColor = Color.WHITE;
		this.boxBorder = new EtchedBorder();
		this.componentColor = new Color(119, 200, 255);
		this.componentBorder = new EtchedBorder();
		this.componentFont = new Font("Monospaced", Font.ITALIC, 14);
		this.titleFont = new Font("Monospaced", Font.BOLD, 14);
	}
	
}
