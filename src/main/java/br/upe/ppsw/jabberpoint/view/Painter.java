package br.upe.ppsw.jabberpoint.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import br.upe.ppsw.jabberpoint.model.SlideItem;

public interface Painter<T extends SlideItem> {
	
	public void draw(int x, int y, float scale, Graphics g, ImageObserver observer, T item);
	

}
