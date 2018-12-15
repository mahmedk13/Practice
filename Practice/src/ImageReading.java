import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedImage img;
		
		File f = new File("D:\\TestImage.jpg");
		
		img = ImageIO.read(f);
		
		File output = new File("D:\\Test1.jpg");
		ImageIO.write(img, "jpg", output);
		
		System.out.println(img.getHeight()+" "+img.getWidth());

	}

}
