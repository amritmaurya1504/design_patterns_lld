package DesignPatterns.DesignTicTacToe;

public class Game {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("Game Winner is : " + game.startGame());
    }
}
