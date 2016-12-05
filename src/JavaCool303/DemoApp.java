package JavaCool303;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class DemoApp {

	public static void main(String[] args) {
		JFrame myWindow = new JFrame();
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Cool303Theme Pastel = new Cool303Theme(new Color(220, 237, 193),
				new EtchedBorder(), new Color(244, 154, 194), new RoundedBorder(10),
				new Font("Monospaced", Font.BOLD, 14), new Font("Monospaced", Font.BOLD, 14));
		
		Cool303Box myBox = new Cool303Box(Pastel,5,4);
		
		for (int i = 1; i <= 20; i++) {
			final int number = i;
			Cool303Button button = new Cool303Button(Pastel);
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
		
		System.out.println("Number of Components added to JPanel: " + myBox.getBox().getComponentCount());

		//myWindow.add(myBox.getBox());
		//myWindow.pack();
		//myWindow.setVisible(true);
	}

}
