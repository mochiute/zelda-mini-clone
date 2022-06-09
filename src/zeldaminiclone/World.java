package zeldaminiclone;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class World {
	public static List<Blocks> blocos = new ArrayList<Blocks>();
	
	public World() {
		for(int xx = 0; xx < 15*2; xx++) {
			blocos.add(new Blocks(xx*32,0));
		}
		for(int xx = 0; xx < 15*2; xx++) {
			blocos.add(new Blocks(xx*32,480-32));
		}
		for(int yy = 0; yy < 15*2; yy++) {
			blocos.add(new Blocks(0,yy*32));
		}
		for(int yy = 0; yy < 15*2; yy++) {
			blocos.add(new Blocks(640-32,yy*32));
		}
		
		
		blocos.add(new Blocks(80, 64));
	}
	
	public static boolean isFree(int x, int y) {
		for(int i = 0; i < blocos.size(); i++) {
			Blocks actualBlock = blocos.get(i);
			if(actualBlock.intersects(new Rectangle(x,y,32,32))) {
				return false;
			}
		}
		
		return true;
	}
	
	public void render (Graphics g) {
		for(int i = 0; i < blocos.size(); i++) {
			blocos.get(i).render(g);
		}
	}
}
