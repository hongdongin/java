package p07;

public class GameExe {

	public static void  runGame(Game game) {
		game.start();
		game.playing();
		game.stop();
	}
	public static void main(String[] args) {
		LeagueofLegend lol  = new LeagueofLegend();
		lol.name="롤";
		runGame(lol);
	}
}
