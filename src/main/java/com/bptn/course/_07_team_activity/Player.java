package com.bptn.course._07_team_activity;

import java.util.Scanner;

public class Player {
    private String name;
    private String playerNumber;

  // create getter methods
    public Player(String name, String playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPlayerNumber() {
        return this.playerNumber;
    }

    public String getNumber() {
        return this.playerNumber;
    }

    /**
     * Prompts the player for which column they want to place their token in
     * and returns the column number.
     */
    // Question: should scanner be static or not? it should not. We got errors when we made it static
    // private static Scanner scanner = new Scanner(System.in); // complete line
    public int makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(this.name + ", enter column number to drop token: ");
        return scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Player " + this.playerNumber + " is " + this.name;
    }
}