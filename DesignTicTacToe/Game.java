package DesignPatterns.DesignTicTacToe;

/**
 * The main class representing the Tic Tac Toe game.
 */
public class Game {

    /**
     * The main method where the execution of the Tic Tac Toe game begins.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an instance of the TicTacToeGame class
        TicTacToeGame game = new TicTacToeGame();

        // Initialize the Tic Tac Toe game board
        game.initializeGame();

        // Start the Tic Tac Toe game and print the winner
        System.out.println("Game Winner is: " + game.startGame());
    }
}
