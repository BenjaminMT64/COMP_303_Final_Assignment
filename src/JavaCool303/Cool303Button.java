package JavaCool303;

import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;

public class Cool303Button extends Cool303Component{

	private JButton button;
	
	public Cool303Button(Cool303Theme myTheme){
		super(myTheme);
		this.button = new JButton();
		applyTheme();
	}
	
	public String getText(){
		return this.button.getText();
	}
	
	public void setText(String buttonText) {
		this.button.setText(buttonText);
	}
	
	public JComponent getSwingComponent() {
		return button;
	}
	
	public void onClick(ActionListener buttonListener){
		this.button.addActionListener(buttonListener);
	}
	
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
