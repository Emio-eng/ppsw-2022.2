package br.upe.ppsw.jabberpoint.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import br.upe.ppsw.jabberpoint.model.BitmapItem;
import br.upe.ppsw.jabberpoint.model.Style;

public class PainterBitmap implements Painter<BitmapItem> {
	
	@Override
	public void draw(int x, int y, float scale, Graphics g, ImageObserver observer, BitmapItem item) {

        BufferedImage bufferedImage = ((BitmapItem) item).getBufferedImage();
        // queria conseguir fazer sem ter essa conversão, mas acho que por conta de ser objeto nao funciona
        
        //converte um slide item para bitmapItem
		Style myStyle = Style.getStyle(item.getLevel());
		Graphics2D g2d = (Graphics2D) g;


        int width = x + (int) (myStyle.getIndent() * scale);
        int height = y + (int) (myStyle.getLeading() * scale);

        
        if (bufferedImage != null) {
            int imageWidth = (int) (bufferedImage.getWidth() * scale);
            int imageHeight = (int) (bufferedImage.getHeight() * scale);
            g2d.drawImage(bufferedImage, width, height, imageWidth, imageHeight, null);
	}
	}
}
