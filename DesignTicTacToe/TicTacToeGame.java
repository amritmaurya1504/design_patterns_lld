package DesignPatterns.DesignTicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame(){
        // creating two players
        players = new LinkedList<>();
        Player player1 = new Player("Amrit Raj", new CrossSymbol());
        Player player2 = new Player("Sampriti M.", new RoundSymbol());

        players.add(player1);
        players.add(player2);

        // initializing the game board;
        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while (noWinner){

            // take out the play whose turn is
            Player playerturn = players.removeFirst();

            // print board and get the free space from the board
            gameBoard.printBoard();
            List<Pair> freeSpace = gameBoard.getFreeSpace();
            if(freeSpace.isEmpty()){
                noWinner = false;
                continue;
            }

            // takes user input
            System.out.println("(" + playerturn.getName() + ")" +"Enter row and column (ex. 1,2) : ");
            Scanner sc = new Scanner(System.in);
            String inputVal = sc.nextLine();
            String[] val = inputVal.split(",");
            int row = Integer.parseInt(val[0]);
            int col = Integer.parseInt(val[1]);

            // place the symbol
            boolean symbolAddedSuccessfully = gameBoard.addSymbol(row, col , playerturn.getPlayingSymbol());
            if(!symbolAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(playerturn);
                continue;
            }

            players.addLast(playerturn);

            boolean winner = isThereWinner(row, col, playerturn.getPlayingSymbol().symbolType);
            if(winner) {
                return playerturn.name;
            }
        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int column, SymbolType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].symbolType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].symbolType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].symbolType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].symbolType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
