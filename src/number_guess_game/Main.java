package number_guess_game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var game = new Game(scanner);
        game.init();
        game.play();
    }

}
