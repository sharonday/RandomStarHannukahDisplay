import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class PaintPanel extends JPanel {

	public PaintPanel() {
		setSize(500, 500);
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random random = new Random();
		g.setColor(Color.WHITE);
		// draw 5 random circles
		int count = 10;
		for (int i = 0; i < count; i++) {
			int r = random.nextInt(250);
			g.drawOval(random.nextInt(250), random.nextInt(250), r, r);
		}
	}

}
