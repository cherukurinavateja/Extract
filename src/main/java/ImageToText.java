import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
public class ImageToText {

		public static void main(String[] args)
		{
			Tesseract tesseract = new Tesseract();
			try {

				tesseract.setDatapath("/Users/navateja/Downloads/Tess4J/tessdata");

				// the path of your tess data folder
				// inside the extracted file
				String text = tesseract.doOCR(new File("/Users/navateja/Desktop/img.png"));

				// path of your image file
				System.out.print(text);
			}
			catch (TesseractException e) {
				e.printStackTrace();
			}
		}

}