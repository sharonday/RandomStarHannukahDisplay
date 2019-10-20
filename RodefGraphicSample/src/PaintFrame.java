import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintFrame extends JFrame {

	private JPanel content = new JPanel();
	private JButton drawButton = new JButton("Draw");
	private PaintPanel paintPanel = new PaintPanel();

	public PaintFrame() {

		getContentPane().add(content);
		content.setLayout(new BorderLayout());

		drawButton.setSize(100, 500);
		drawButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				paintPanel.repaint();
			}
		});
		content.add(drawButton, BorderLayout.WEST);
		content.add(paintPanel, BorderLayout.CENTER);
	}
	

}
