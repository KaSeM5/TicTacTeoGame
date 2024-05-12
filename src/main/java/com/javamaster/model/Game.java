package com.javamaster.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Game {
    private String gameId;

    private Player player1;

    private Player player2;

    private GameStatus status;

    private int [][] board;

    private TicToe winner;


    public void setGameId(UUID uuid) {
        gameId = uuid.toString();
    }

    public void setBoard(int[][] ints) {
        board = ints;
    }

    public void setPlayer1(Player player) {
        player1 = player;
    }

    public void setStatus(GameStatus gameStatus) {
        status = gameStatus;
    }

    public void setPlayer2(Player player) {
        player2 = player;
    }

    public void setWinner(TicToe ticToe) {
        winner = ticToe;
    }
}
