import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class PaintPanel extends JPanel {

	public PaintPanel() {
		setSize(600, 500);
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random randy = new Random();
		int num = randy.nextInt(200);
		System.out.println(num);

		// Circles must be inside this box
		g.setColor(Color.white);
		g.fillRect(0, 0, 600, 500);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		for (int i = 1; i <= num; i++) {

			// Random color
			int r = randy.nextInt(256);
			int v = randy.nextInt(256);
			int b = randy.nextInt(256);
			// int a = randy.nextInt(100);
			Color c = new Color(r, v, b);
			g2.setColor(c);

			// draw triangle
			// random side length
			int s = 5 + randy.nextInt(50);

			// Random location
			int x = randy.nextInt(601 - (s));
			int y = randy.nextInt(501 - (s));

			// find height using math
			int h = (int) (s * Math.cos(0.5));

			// right side up triangle
			int[] xPoints = { x, (x - s / 2), (x + s / 2) };
			int[] yPoints1 = { y, (y + h), (y + h) };
			g2.fillPolygon(xPoints, yPoints1, 3);

			// up side down triangle
			int[] yPoints2 = { (int) (y + 1.33 * h), (int) (y + 0.33 * h), (int) (y + 0.33 * h) };
			g2.fillPolygon(xPoints, yPoints2, 3);

		}

	}
}
