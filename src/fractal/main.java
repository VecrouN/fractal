package fractal;

import fractal.Complex;

public class main {

	public static void main(String[] args) {

		int height = 1080;
		int width = 1920;
		System.out.println("LOG:\nwidth = " + width + "\nheight = " + height + "\n\n");
	}

	public static int getGrayColor(Complex z0) {
		Complex z = z0;
		for (int i = 255; i != 0; --i) {
			if (z.abs() > 2) {
				return i;
			}
			z = z * z + z0;
		}
		return 0;
	}

}
