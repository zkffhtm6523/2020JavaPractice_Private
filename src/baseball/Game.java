package baseball;

public class Game {
	public static void main(String[] args) {
		final int GAMECNT = 3;
		Baseball ball = new Baseball(GAMECNT);
		MyBall myball = new MyBall(GAMECNT);
		
		do {
			myball.setNumbers();
		} while (Checker.check(GAMECNT,ball,myball));
		System.out.println("게임 종료");
	}
}
