package fractal;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws Exception {

		int height = 1080;
		int width = 1920;
		BufferedImage test = ImageIO.	

		try {
			File file = new File("tmp/img1.jpg");
			BufferedImage source = ImageIO.read(file);

			BufferedImage result1 = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
			BufferedImage result2 = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
			Color color = new Color(0, 0, 0);
			Color newColor = new Color(0, 0, 0);
			int grey1 = 0;
			int grey2 = 0;

			for (int x = 0; x<result1.getWidth(); ++x) {
				for (int y = 0; y < result1.getHeight(); ++y) {
					color = new Color(source.getRGB(x, y));

					grey1 = (int) (color.getRed() * 0.299 + color.getGreen() * 0.587 + color.getBlue() * 0.114);
					grey2 = (int) ((color.getRed() + color.getGreen() + color.getBlue()) / 3);


					newColor = new Color(grey1, grey1, grey1);
					result1.setRGB(x, y, newColor.getRGB());

					newColor = new Color(grey2, grey2, grey2);
					result2.setRGB(x, y, newColor.getRGB());


				}
			}
			File output = new File("tmp/img1_grey1.jpg");
			ImageIO.write(result1, "jpg", output);

			output = new File("tmp/img1_grey2.jpg");
			ImageIO.write(result2, "jpg", output);

		} catch (IOException e)
		{
			System.out.println("Файл не найден или не удалось сохранить "+e);
		}

		System.out.println("LOG:\nwidth = " + width + "\nheight = " + height + "\n\n");
	}

}
