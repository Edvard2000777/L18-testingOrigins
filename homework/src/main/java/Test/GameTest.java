package Test;

import ru.otus.game.*;

public class GameTest {

    private  final  Game game =
            new Game(new DiceImpl(),new GameWinnerConsolePrinter());

    public void testGameTestV1() {
        String scenario = "V1. Тест класса game";
        try {
          Player player1 = new Player("Yhu");
          Player player2 = new Player("Yhu2");
          game.playGame(player1,player2);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void testGameTestPlayerIsNulShouldThrowException() {
        String scenario = "V2. Тест класса game";
        try {
            Player player1 = null;
            Player player2 = null;
            game.playGame(player1,player2);
            System.out.printf("%s passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("%s fails with message  %n", scenario);
        }
    }

    public static void main(String[] args) {
        new GameTest().testGameTestV1();
        new GameTest().testGameTestPlayerIsNulShouldThrowException();
    }
}
