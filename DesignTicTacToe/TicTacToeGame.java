package DesignPatterns.DesignTicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * The class representing the Tic Tac Toe game logic.
 */
public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    /**
     * Initializes the Tic Tac Toe game with two players and an empty game board.
     */
    public void initializeGame(){
        // Creating two players
        players = new LinkedList<>();
        Player player1 = new Player("Amrit Raj", new CrossSymbol());
        Player player2 = new Player("Sampriti M.", new RoundSymbol());

        players.add(player1);
        players.add(player2);

        // Initializing the game board
        gameBoard = new Board(3);
    }

    /**
     * Starts the Tic Tac Toe game, alternating turns between players until there is a winner or a tie.
     * @return The name of the winning player or "Tie" if there's no winner.
     */
    public String startGame(){
        boolean noWinner = true;
        while (noWinner){

            // Take out the player whose turn it is
            Player playerTurn = players.removeFirst();

            // Print the board and get the free spaces from the board
            gameBoard.printBoard();
            List<Pair> freeSpace = gameBoard.getFreeSpace();
            if(freeSpace.isEmpty()){
                noWinner = false;
                continue;
            }

            // Takes user input for row and column
            System.out.println("(" + playerTurn.getName() + ")" +"Enter row and column (ex. 1,2) : ");
            Scanner sc = new Scanner(System.in);
            String inputVal = sc.nextLine();
            String[] val = inputVal.split(",");
            int row = Integer.parseInt(val[0]);
            int col = Integer.parseInt(val[1]);

            // Place the symbol on the board
            boolean symbolAddedSuccessfully = gameBoard.addSymbol(row, col , playerTurn.getPlayingSymbol());
            if(!symbolAddedSuccessfully) {
                // Player cannot insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            // Check for a winner after each move
            boolean winner = isThereWinner(row, col, playerTurn.getPlayingSymbol().symbolType);
            if(winner) {
                return playerTurn.name;
            }
        }
        return "Tie";
    }

    /**
     * Checks if there is a winner based on the last move made.
     * @param row The row of the last move.
     * @param column The column of the last move.
     * @param pieceType The type of symbol placed in the last move.
     * @return True if there is a winner, false otherwise.
     */
    public boolean isThereWinner(int row, int column, SymbolType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check in the row
        for(int i=0; i<gameBoard.size; i++) {
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].symbolType != pieceType) {
                rowMatch = false;
            }
        }

        // Check in the column
        for(int i=0; i<gameBoard.size; i++) {
            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].symbolType != pieceType) {
                columnMatch = false;
            }
        }

        // Check diagonals
        for(int i=0, j=0; i<gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].symbolType != pieceType) {
                diagonalMatch = false;
            }
        }

        // Check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].symbolType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
