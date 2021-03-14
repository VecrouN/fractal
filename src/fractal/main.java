package fractal;

import fractal.Complex;

public class main {

	public static void main(String[] args) {

		int height = 1080;
		int width = 1920;

		initColorMap(32, Color.RED, Color.GREEN, Color.BLUE);
		image = new BufferedImage(xSize, ySize, BufferedImage.TYPE_INT_RGB);
		imageComponent = new JPanel() {
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image, 0, 0, this);
			}
		};

		System.out.println("LOG:\nwidth = " + width + "\nheight = " + height + "\n\n");
	}

	public static int getGrayColor(Complex z0) {
		Complex z = z0;
		for (int i = 255; i != 0; --i) {
			if (z.abs() > 2) {
				return i;
			}
			z = z.times(z).plus(z0);
		}
		return 0;
	}
}
