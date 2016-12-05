package JavaCool303;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class ButtonTest extends JButton {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JButton b=new JButton("Click Me...");
		b.setBorder(new RoundedBorder(10));
		
		b.setBackground(new Color(220, 237, 193));
		b.setOpaque(true);
		b.setBounds(50,50,90, 50); 
		frame.add(b);
		
		// Setting Frame size. This is the window size
        frame.setSize(300,200);  
        //frame.getRootPane().setBorder(new EtchedBorder());
        
        frame.setLayout(null);  
        frame.setVisible(true);  
                  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}


