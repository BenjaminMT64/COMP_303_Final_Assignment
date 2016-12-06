// Aaron Gaba (Student ID: 260450580)
// Benjamin Taubenblatt (Student ID: 260626105)

package JavaCool303;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

/**
 * A Cool303Container is a generic container, based around an AWT Container, 
 * that holds Cool303Components.  The container is invisible, however, its contents
 * are visible.
 *
 * A Cool303Container uses from AWT, a GridLayout, for its layout.
 */
public class Cool303Container extends Cool303Component{
	
	protected Container guiContainer = new Container();
	
	/**
	 * Constructs a new Cool303Container with its layout based upon Swing's Grid Layout
	 * @param rows Number of rows in the container's layout
	 * @param cols Number of columns in the container's layout
	 * @param theme The Cool303Theme that all components within this container shall follow
	 */
	public Cool303Container(int rows, int cols, Cool303Theme theme){
		super(theme);
		guiContainer = new Container();
		guiContainer.setLayout(new GridLayout(rows, cols));
	}
	
	
	/**
	 * The 'addComponent' method inserts a Cool303Component at the next open position
	 * in the grid layout.  However, because of the nature of Swing, a Cool303Container
	 * may NOT contain a Cool303Frame, which is a JFrame wrapper.
	 * @param c Cool303Component to be added
	 */
	public void addComponent(Cool303Component c) {
		if (!(c instanceof Cool303Frame)) {
			c.setTheme(super.getTheme());
			this.guiContainer.add(c.getSwingComponent());
		} else {
			throw new IllegalArgumentException("A Cool303Frame may not be added to a Cool303Container.");
		}
	}
	
	/**
	 * The 'removeComponent' method removes the Cool303Component at the specified position.
	 * This method is a wrapper around the AWT Container method, 'remove(index)'.
	 * @param index The position of the Cool303Component to be removed
	 */
	public void removeComponent(int index){
		this.guiContainer.remove(index);
	}
	
	
	protected Component getSwingComponent(){
		return this.guiContainer;
	}
	
	/**
	 * For a generic Cool303Container, this is a dummy method that is not implemented.
	 * This method is overridden by subclasses of Cool303Container, for whom, that container
	 * is shown.
	 */
	public void applyTheme() {
		// TODO Auto-generated method stub	
	}
	
}
