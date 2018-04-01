import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
public class DigitalClock extends JFrame {
	
	JLabel jlabClock;
	ClockThread ct;
	public DigitalClock() {
		jlabClock = new JLabel("");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlabClock.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		add(jlabClock);
		setSize(430,100);
		setLocationRelativeTo(null);
		ct = new ClockThread(this);
		setResizable(false);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new DigitalClock();
		
	}

}
