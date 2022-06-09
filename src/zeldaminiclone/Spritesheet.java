package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	public static BufferedImage spritesheet;
	
	public static BufferedImage titleWall;
	
	public static BufferedImage grass;

	public static BufferedImage[] player_front;
	
	public static BufferedImage[] enemy_front;
	
	public Spritesheet () {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		player_front = new BufferedImage[2];
		enemy_front = new BufferedImage[2];
		
		player_front[0] = Spritesheet.getSprite(0, 11,16,16);
		player_front[1] = Spritesheet.getSprite(16, 11,16,16);
		
		enemy_front[0] = Spritesheet.getSprite(280,273,32,32);
		enemy_front[1] = Spritesheet.getSprite(318,273,32,32);
		
		titleWall = Spritesheet.getSprite(280, 247, 16, 16);
		
		grass = Spritesheet.getSprite(317, 215, 32, 32);
	}
	
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
	
}
