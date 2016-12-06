// Aaron Gaba (Student ID: 260450580)
// Benjamin Taubenblatt (Student ID: 260626105)

package JavaCool303;

import java.awt.Component; 
import java.awt.Dimension;
import java.awt.GridLayout; 
import javax.swing.JPanel;

/**
 * A Cool303Box is a visible container, which, by being a subclass of Cool303Container,
 * can contain Cool303Components and Cool303Containers.
 * 
 * It is a wrapper class around JPanel.
 *
 */
public class Cool303Box extends Cool303Container {
	private JPanel box; 
	
	/**
	 * Constructs a new Cool303Box with its layout based upon Swing's Grid Layout
	 * @param theme The Cool303Theme that all components within this container shall follow
	 * @param rows Number of rows in the container's layout
	 * @param cols Number of columns in the container's layout
	 */
	public Cool303Box(Cool303Theme theme, int rows, int cols){
		super(rows, cols, theme);
		box = new JPanel(new GridLayout(rows, cols, 5, 5)); 
		
		// Override the primitive AWT container with the JPanel
		// as JPanel, itself, is a subclass of the AWT container.
		this.guiContainer = box;	
		
		// Colorize the box and stylize the borders
		applyTheme();
	}
	
	/**
	 * Given a specified height and width, the 'setBoxSize' method attempts to resize under
	 * those given size constraints.  If the given constraints are too small (i.e., prevent
	 * part of window to be seen), then constraints are ignored and the window unaffected.
	 * 
	 * @param height The new height of the window
	 * @param width The new width of the window
	 */
	public void setBoxSize(int height, int width){
		
		if((box.getMinimumSize().width <= width) && (box.getMinimumSize().height <= height)){ 
			Dimension newBoxSize = new Dimension(); 
			newBoxSize.setSize(width, height); //set dimension size
			box.setSize(newBoxSize); //setting box dimension
		}
	}
	
	/**
	 * The 'getBoxSize' method returns the size of the JPanel that is Cool303Box is wrapped around
	 * @return Height and width of the enclosed JPanel
	 */
	public Dimension getBoxSize() {
		return box.getSize();
	}
	
	/**
	 * With its given theme, the 'applyTheme' method will stylize the box's background color
	 * and its border.  If the theme's box color and/or box border is not specified, then
	 * the box will revert to the default color and/or border as specified by the Swing Look-and-Feel.
	 */
	public void applyTheme(){
		if (theme.getBoxColor() != null) {
			this.box.setBackground(theme.getBoxColor());
		}
		
		if (theme.getBoxBorder() != null) {
			this.box.setBorder(theme.getBoxBorder());
		}
	}
	
	/**
	 * This method returns the underlying JPanel, which is intended either for nesting
	 * the JPanels or for retrieving the JPanel to be displayed in a Cool303Frame (a wrapper
	 * for JFrame).
	 */
	@Override
	protected Component getSwingComponent() {
		return this.box;
	}

}
