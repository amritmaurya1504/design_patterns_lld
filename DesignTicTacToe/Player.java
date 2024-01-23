package DesignPatterns.DesignTicTacToe;

public class Player {
    String name;
    Symbol playingSymbol;

    public Player(String name, Symbol playingSymbol) {
        this.name = name;
        this.playingSymbol = playingSymbol;
    }

    public String getName() {
        return name;
    }

    public Symbol getPlayingSymbol() {
        return playingSymbol;
    }
}
