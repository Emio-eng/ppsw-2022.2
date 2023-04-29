package br.upe.ppsw.jabberpoint.interfaces;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import br.upe.ppsw.jabberpoint.model.SlideItem;

public interface Painter {
	
	public void draw(int x, int y, float scale, Graphics g, ImageObserver observer, SlideItem item);
	

}
