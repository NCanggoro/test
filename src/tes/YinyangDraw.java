package tes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class YinyangDraw extends JFrame {
	private static final long serialVersionUID = 1L;//auto generate version
	public YinyangDraw(){
		super("test yin yang");
		this.setSize(500,500);
	}
	//
	public void paint(Graphics t ){
		super.paint(t);// paint java package
		//yinyang position
		int xCenter = getHeight() / 2;
		int yCenter = getWidth() / 2;
		//size
		int jariJari = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		int x = xCenter - jariJari;
		int y = yCenter - jariJari;
	
		//create yin yang
		t.setColor(Color.black);
		t.fillOval(x, y, 2 * jariJari, 2 * jariJari);
		t.setColor(Color.white);
		t.drawOval(x, y, 2 * jariJari, 2 * jariJari);
		t.setColor(Color.white);
		t.fillArc(x, y, 2 * jariJari, 2 * jariJari, 90, 180);
		t.setColor(Color.black);
		t.fillOval(x + (jariJari / 2), y + jariJari, jariJari, jariJari);
		t.setColor(Color.white);
		t.fillOval(x + (jariJari / 2), y , jariJari, jariJari);
		
		t.setColor(Color.black);
		t.fillOval(x + jariJari- (jariJari/ 4), y + jariJari/ 4, jariJari/ 2, jariJari/ 2);
		t.setColor(Color.white);
		t.fillOval(x + jariJari - (jariJari/ 4), y + jariJari+ jariJari/ 4, jariJari/ 2, jariJari/ 2);
	}
}
