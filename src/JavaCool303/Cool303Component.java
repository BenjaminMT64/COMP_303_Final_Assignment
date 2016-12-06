// Aaron Gaba (Student ID: 260450580)
// Benjamin Taubenblatt (Student ID: 260626105)

package JavaCool303;

import java.awt.Component;

/**
 * The Cool303Component class serves as the framework for
 * all concrete components (e.g., Cool303Button).
 * 
 * It is a wrapper around AWT components, whereupon it applies
 * the theme passed to it.
 * 
 */
public abstract class Cool303Component {
	protected Cool303Theme theme; 
	 
	/**
	 * Constructor for a generic Cool303Component
	 * @param theme The Cool303Theme that is to be applied to this component.
	 */
	public Cool303Component(Cool303Theme theme){
		this.theme = theme; 
	}
	
	/**
	 * For the Swing components that lie underneath to be handled
	 * for collection and displaying in containers and whatnot,
	 * the 'getSwingComponent' acts as a secure unwrapping.
	 * @return
	 */
	protected abstract Component getSwingComponent();
	
	/**
	 * The 'setTheme' method sets and applies the given theme for this Cool303Component.
	 * @param selectedTheme The Cool303Theme to be associated and applied to the component
	 */
	protected void setTheme(Cool303Theme selectedTheme){
		this.theme = selectedTheme; 
		applyTheme();
	}
	
	/**
	 * The 'applyTheme' method applies this Cool303Component's Cool303Theme 
	 * in an manner depending upon what the underlying Swing component is.
	 */
	public abstract void applyTheme();
	
	/** The 'getTheme' method returns a copy of the Cool303Theme associated with the object.
	 * @return Cool303Theme
	 */
	public Cool303Theme getTheme() {
		return this.theme;
	}

	

}
