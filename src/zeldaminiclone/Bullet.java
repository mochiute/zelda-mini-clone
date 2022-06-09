package zeldaminiclone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends Rectangle{
	
	public int dir = 1;
	public int speed = 8;
	
	public int frames = 0;
	
	public Bullet(int x, int y, int dir) {
		super(x+16,y+16,15,15);
		this.dir = dir;
	}
	
	
	public void tick() {
		x+=speed*dir;
		frames++;
		if(frames == 60) {
			Player.bullets.remove(this);
			return;
		}
	}
	
	public void render (Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x, y, width, height);
	}
}
