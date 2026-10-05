package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Chest extends SuperObject {
	
	GamePanel gg;

	public OBJ_Chest(GamePanel gg) {
		
		this.gg = gg;
		
		name = "Chest";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
			image = uTool.scaleImage(image, gg.tileSize, gg.tileSize);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
