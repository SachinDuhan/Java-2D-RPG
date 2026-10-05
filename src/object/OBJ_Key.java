package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;


public class OBJ_Key extends SuperObject {
	
	GamePanel gg;

	public OBJ_Key(GamePanel gg) {
		
		this.gg = gg;
		
		name = "Key";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
			image = uTool.scaleImage(image, gg.tileSize, gg.tileSize);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
