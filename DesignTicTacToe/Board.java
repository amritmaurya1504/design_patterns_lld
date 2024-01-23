package DesignPatterns.DesignTicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    public Symbol[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new Symbol[size][size];
    }

    public boolean addSymbol(int row, int col, Symbol symbol){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = symbol;
        return true;
    }

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
