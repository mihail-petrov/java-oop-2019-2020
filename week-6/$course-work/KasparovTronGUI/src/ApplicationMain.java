import javax.swing.*;

public class ApplicationMain {

	public static void main(String[] args) {
	
		JFrame windowFrame = new JFrame();
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(500, 500);
		windowFrame.add(new ApplicationWindow());
		windowFrame.setVisible(true);
	}
}
