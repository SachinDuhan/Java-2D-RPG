package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Door extends SuperObject {
	
	GamePanel gg;

	public OBJ_Door(GamePanel gg) {
		
		this.gg = gg;
		
		name = "Door";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));
			image = uTool.scaleImage(image, gg.tileSize, gg.tileSize);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		collision = true;
	}
}
