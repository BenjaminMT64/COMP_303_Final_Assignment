package JavaCool303;

import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;

public class Cool303Button extends Cool303Component{

	private JButton button;
	
	public Cool303Button(Cool303Theme myTheme){
		super(myTheme);
		button = new JButton();
	}
	
	public JComponent getSwingComponent() {
		return button;
	}
	
	public void onClick(ActionListener buttonListener){
		this.button.addActionListener(buttonListener);
	}
	
	@Override
	public void applyTheme() {
		// TODO Auto-generated method stub
		
	}

}
