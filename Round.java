/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdiagramclasses;

import java.util.List;

/**
 *
 * @author jalan
 */
public class Round {
    private int roundNumber;
    private Player playerTurn;
    private boolean shipHit;

    public Round(int roundNumber, Player playerTurn) {
        this.roundNumber = roundNumber;
        this.playerTurn = playerTurn;
        this.shipHit = false;
    }

    // Getters and setters...
    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public Player getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(Player playerTurn) {
        this.playerTurn = playerTurn;
    }

    public boolean isShipHit() {
        return shipHit;
    }

    public void setShipHit(boolean shipHit) {
        this.shipHit = shipHit;
    }

    // Method to start the round
    public void startRound() {
        System.out.println("Round " + roundNumber + " started. It's " + playerTurn.getName() + "'s turn.");
    }

    // Method to get the turn
    public void getTurn() {
        System.out.println("It's " + playerTurn.getName() + "'s turn.");
    }

    // Method to check if the ship is hit
    public void isHitShip() {
        if (shipHit) {
            System.out.println("Ship hit!");
        } else {
            System.out.println("Ship not hit.");
        }
    }
    
     public void addTorpedoes(Player player, int count) {
        for (int i = 0; i < count; i++) {
            if (player.getTorpedoes().size() < 20) { // Assuming a maximum of 20 torpedoes
                player.getTorpedoes().add(new Torpedo());
            } else {
                System.out.println("Error: Maximum number of torpedoes reached.");
                break;
            }
        }
    }

    // Method to remove torpedoes from the player's inventory
    public void removeTorpedoes(Player player, int count) {
        for (int i = 0; i < count; i++) {
            if (!player.getTorpedoes().isEmpty()) {
                player.getTorpedoes().remove(0);
            } else {
                System.out.println("Error: No torpedoes left to remove.");
                break;
            }
        }
    }

    // Method to add ships to the player's fleet
    public void addShips(Player player, int count) {
        for (int i = 0; i < count; i++) {
            if (player.getShips().size() < 10) { // Assuming a maximum of 10 ships
                player.getShips().add(new Ship());
            } else {
                System.out.println("Error: Maximum number of ships reached.");
                break;
            }
        }
    }

    // Method to remove ships from the player's fleet
    public void removeShips(Player player, int count) {
        for (int i = 0; i < count; i++) {
            if (!player.getShips().isEmpty()) {
                player.getShips().remove(0);
            } else {
                System.out.println("Error: No ships left to remove.");
                break;
            }
        }
    }
    
     public void listObjects() {
        System.out.println("Player: " + playerTurn.getName());
        System.out.println("Torpedoes:");
        List<Torpedo> torpedoes = playerTurn.getTorpedoes();
        for (int i = 0; i < torpedoes.size(); i++) {
            System.out.println("Torpedo " + (i + 1));
        }
        System.out.println("Ships:");
        List<Ship> ships = playerTurn.getShips();
        for (int i = 0; i < ships.size(); i++) {
            System.out.println("Ship " + (i + 1));
        }
    }
}
