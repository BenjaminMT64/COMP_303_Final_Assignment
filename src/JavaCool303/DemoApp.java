package JavaCool303;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class DemoApp {

	public static void main(String[] args) {
		JFrame myWindow = new JFrame();
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Cool303Theme sampleTheme = new Cool303Theme();
		
		Cool303Box myBox = new Cool303Box(sampleTheme,5,4);
		
		for (int i = 1; i <= 20; i++) {
			final int number = i;
			Cool303Button button = new Cool303Button(null);
			button.onClick(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println(number);
				}
			});
			//myBox.addComponent(button);
		}

		myWindow.add(myBox.getBox());
		myWindow.pack();
		myWindow.setVisible(true);
	}

}
