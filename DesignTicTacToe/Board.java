package DesignPatterns.DesignTicTacToe;

import java.util.ArrayList;
import java.util.List;

/**
 * The class representing the Tic Tac Toe game board.
 */
public class Board {
    int size;
    public Symbol[][] board;

    /**
     * Constructs a Tic Tac Toe game board with the specified size.
     * @param size The size of the game board.
     */
    public Board(int size) {
        this.size = size;
        this.board = new Symbol[size][size];
    }

    /**
     * Adds a symbol to the specified row and column on the game board.
     * @param row The row index where the symbol should be added.
     * @param col The column index where the symbol should be added.
     * @param symbol The symbol to be added.
     * @return True if the symbol is added successfully, false if the cell is already occupied.
     */
    public boolean addSymbol(int row, int col, Symbol symbol){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = symbol;
        return true;
    }

    /**
     * Gets a list of pairs representing the free spaces on the game board.
     * @return List of Pair objects representing the row and column indices of free spaces.
     */
    public List<Pair> getFreeSpace () {

        List<Pair> freeSpace = new ArrayList<>();
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size ; j++) {
                if(board[i][j] == null){
                    freeSpace.add(new Pair(i, j));
                }
            }
        }

        return freeSpace;
    }

    /**
     * Prints the current state of the game board.
     */
    public void printBoard (){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                if(board[i][j] != null){
                    System.out.print(board[i][j].symbolType.name() + " ");
                }else{
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
