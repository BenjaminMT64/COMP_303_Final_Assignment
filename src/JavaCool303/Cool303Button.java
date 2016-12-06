// Aaron Gaba (Student ID: 260450580)
// Benjamin Taubenblatt (Student ID: 260626105)

package JavaCool303;

import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JComponent;

import java.awt.event.ActionListener;

/**
 * A Cool303Button is a Cool303Component wrapper for Swing's JButton.
 *
 */
public class Cool303Button extends Cool303Component{

	private JButton button;
	
	/**
	 * Constructor for Cool303Button.  
	 * If no theme is given, mostly in the event that it will receive a theme from its parent container, this button will not be stylized.
	 * 
	 * @param myTheme Cool303Theme to be applied
	 */
	public Cool303Button(Cool303Theme myTheme){
		super(myTheme);
		this.button = new JButton();
		if (myTheme != null) {
			applyTheme();
		}
	}
	
	/**
	 * The 'getText' method retrieves the button's text (label).  This method is a wrapper around the JButton method of 'getText.'
	 * @return String of the button's text label
	 */
	public String getText(){
		return this.button.getText();
	}
	
	/**
	 * The 'setText' method sets the button's text (label).  This method is a wrapper around the JButton method of 'setText.'
	 * @param buttonText The text to be shown on this button
	 */
	public void setText(String buttonText) {
		this.button.setText(buttonText);
	}
	
	/**
	 * The 'getSwingComponent' method for a Cool303Button returns the underlying JButton, which is intended to allow Cool303Containers to add buttons
	 * to AWT/Swing containers.
	 */
	protected Component getSwingComponent() {
		return button;
	}
	
	/**
	 * The 'onClick' method associates the given ActionListener to the underlying JButton
	 * when it is clicked.  This method is a wrapper for the JButton method of 'addActionListener.'
	 * 
	 * @param buttonListener The ActionListener to be associated with mouse-click events
	 */
	public void onClick(ActionListener buttonListener){
		this.button.addActionListener(buttonListener);
	}
	
	/**
	 * With its given theme, the 'applyTheme' method will stylize the button's background color,
	 * border, and font (for the label).  If the theme's component color, border, and/or font is 
	 * not specified, then the box will revert to default styles as specified by the Swing Look-and-Feel.
	 */
	@Override
	public void applyTheme() {
		if (theme.getComponentColor() != null) {
			this.button.setBackground(theme.getComponentColor());
			this.button.setOpaque(true);
		}
		
		if (theme.getComponentBorder() != null) {
			this.button.setBorder(theme.getComponentBorder());
		}
		
		if (theme.getComponentFont() != null) {
			this.button.setFont(theme.getComponentFont());
		}
	}

}
