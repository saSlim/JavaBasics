import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;


public class GameApp extends Applet{

	private Game game;
	
	public void init() {
		game= new Game();
		game.setPreferredSize(new Dimension(600,525));
		game.setVisible(true);
		game.setFocusable(true);
		this.add(game);
		this.setVisible(true);
			
		
	}
	
	
	public void paint(Graphics g){
		this.setSize(new Dimension(800,650));
		
	}
	
	
}
