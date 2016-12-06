// Aaron Gaba (Student ID: 260450580)
// Benjamin Taubenblatt (Student ID: 260626105)

package JavaCool303;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoApp {

	public static void main(String[] args) {
		
		Cool303Theme Pastel = new Cool303Theme();
		Pastel.setPastelTheme();
		
		Cool303Box myBox = new Cool303Box(Pastel,5,4);
		
		for (int i = 1; i <= 20; i++) {
			final int number = i;
			Cool303Button button = new Cool303Button(null);
			button.setText(Integer.toString(i));
			button.onClick(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println(number);
				}
			});
			myBox.addComponent(button);
		}
		
		Cool303Frame myFrame = new Cool303Frame(Pastel, myBox);
		myFrame.makeFrame();
		
	}

}
