// Aaron Gaba (Student ID: 260450580)
// Benjamin Taubenblatt (Student ID: 260626105)

package JavaCool303;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

/**
 * The RoundedBorder class constructs a round rectangular border around
 * an AWT component.
 *
 */

public class RoundedBorder implements Border{

	//Radius of the RoundedBorder
	private int radius;


	RoundedBorder(int radius) {
		this.radius = radius;
	}

	/**
	 * Creates the Insets for the rounded border to be constructed for given component
	 */
	public Insets getBorderInsets(Component c) {
		return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	}


	public boolean isBorderOpaque() {
		return false;
	}


	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	}


}
