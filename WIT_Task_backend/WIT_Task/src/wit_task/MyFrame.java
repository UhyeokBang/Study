package wit_task;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	public JLabel label = new JLabel();
	public String title;
	
	public MyFrame(String title) {
		super(title);
		this.setSize(500, 500);
		this.setLocation(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}
	public void init() {
		label.setFont(new Font("±Ã¼­Ã¼", Font.BOLD, 24));
		label.setText("202011300¹æ¿ìÇõ");
		this.add(label);
	}
}
