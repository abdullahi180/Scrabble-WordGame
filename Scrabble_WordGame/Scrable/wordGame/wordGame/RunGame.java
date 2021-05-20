package wordGame;
/**
 * this is the main method word game.
 * This main method includes the features that the intended
 * prototype system is expected to have.
 * 
 * @author  ADEREMI AJIDAHUN
 * @author  RONIL GOLDENWALLA
 * @author  ABDULLAHI SHIDANE
 * @author  ROHAN SINGAMSETTY
 * 
 */
import java.io.IOException;

public class RunGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = null;
		try {
			game = new Game();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TUI tui = new TUI(game);
	}

}
