import core.Game;

public class Main {
	
	public static void main(String[] args) {
		Game game = new Game();
		game.setOptions(args);
		game.initialize();
		game.start();
	}
	
}
