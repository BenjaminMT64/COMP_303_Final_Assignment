package JavaCool303;
import javax.swing.JFrame;

public class Cool303Frame extends Cool303Component {
	private JFrame myWindow; 
	private Cool303Box frameBox;
	
	public Cool303Frame(Cool303Theme myTheme, Cool303Box frameBox){ 
		super(myTheme);
		myWindow = new JFrame(); 
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frameBox = frameBox;
		
		setFrameContents();
	}	
	
	private boolean isFrameAlreadyFilled() {
		return (this.myWindow.getContentPane().getComponentCount() == 1);
	}
	
	private void setFrameContents() {
		if (isFrameAlreadyFilled()) {
			this.myWindow.getContentPane().remove(0);
		} 
		
		this.myWindow.getContentPane().add(this.frameBox.getSwingComponent());
	}
	
	public void makeFrame(){
		myWindow.pack(); //sizes frame to scale content
		myWindow.setVisible(true); //set frame visibility 
	}
	
	public void add(Cool303Box b){
		//aBox = b; 
	}

	@Override
	public void applyTheme() {
		// TODO Auto-generated method stub
	}
	
	

}
