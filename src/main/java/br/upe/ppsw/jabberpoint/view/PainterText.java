package br.upe.ppsw.jabberpoint.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.image.ImageObserver;
import java.util.List;

import br.upe.ppsw.jabberpoint.model.Style;
import br.upe.ppsw.jabberpoint.model.TextItem;

public class PainterText implements Painter<TextItem> {
	
	@Override
	public void draw(int x, int y, float scale, Graphics g, ImageObserver observer, TextItem item) {
		
		if (item == null || item.getText().isEmpty()) return;


        Style myStyle = Style.getStyle(item.getLevel());
        myStyle = myStyle == null ? new Style(y, null, y, y) : myStyle;

        g.setColor(myStyle.getColor());

        List<TextLayout> layouts = item.getLayouts(g, myStyle, scale);
        
        Graphics2D g2d = (Graphics2D) g.create();
        
        // Atualiza para a posição correta
        g2d.translate(x + (int) (myStyle.getIndent() * scale), y + (int) (myStyle.getLeading() * scale));
        
        // Dentro do for ele vai percorrendo e desenhando
        for (TextLayout layout : layouts) {
            layout.draw(g2d, 0, 0);
            
            // Move para a próxima linha, levando em consideração a altura
            g2d.translate(0, layout.getAscent() + layout.getDescent());
        }

        g2d.dispose();
        //limpa o G2 quando n é mais necessário. Evita consumo desnecessário
    }

}
