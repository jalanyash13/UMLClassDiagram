/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdiagramclasses;

import java.util.Date;

/**
 *
 * @author jalan
 */
public class Game {
    
     private Date gametime;
    private Date starttime;
    private CombPlayers gametype;
    private Player player1id;
    private Player player2id;

    public Game(Date gametime, Date starttime, CombPlayers gametype, Player player1id, Player player2id) {
        this.gametime = gametime;
        this.starttime = starttime;
        this.gametype = gametype;
        this.player1id = player1id;
        this.player2id = player2id;
    }

    // Getters and setters...

    public Date getGametime() {
        return gametime;
    }

    public void setGametime(Date gametime) {
        this.gametime = gametime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     *
     * @return
     */
    public CombPlayers getGametype() {
        return gametype;
    }

    /**
     *
     * @param gametype
     */
    public void setGametype(CombPlayers gametype) {
        this.gametype = gametype;
    }

    public Player getPlayer1id() {
        return player1id;
    }

    public void setPlayer1id(Player player1id) {
        this.player1id = player1id;
    }

    public Player getPlayer2id() {
        return player2id;
    }

    public void setPlayer2id(Player player2id) {
        this.player2id = player2id;
    }
}

class CombPlayers {
    private Player[] players;

    public CombPlayers(Player[] players) {
        if (players.length != 2) {
            throw new IllegalArgumentException("There must be exactly 2 players.");
        }
        boolean humanPlayerExists = false;
        for (Player player : players) {
            if (!(player instanceof HumanPlayer)) {
            } else {
                humanPlayerExists = true;
                break;
            }
        }
        if (!humanPlayerExists) {
            throw new IllegalArgumentException("At least one player must be human.");
        }
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
    
    class HumanPlayer extends Player {
    public HumanPlayer(int pid, String name, int score) {
        super(pid, name, score);
    }
}

class AIPlayer extends Player {
    public AIPlayer(int pid, String name, int score) {
        super(pid, name, score);
    }
}

 public void addPlayer(Player player) {
        Object player1id = null;
        Object player2id = null;
        if (player1id == null) {
            player1id = player;
        } else if (player2id == null) {
            player2id = player;
        } else {
            System.out.println("Error: Maximum number of players reached.");
        }
    }

    // Method to remove a player from the game
    public void removePlayer(Player player) {
        Object player1id = null;
        Object player2id = null;
        if (player.equals(player1id)) {
            player1id = null;
        } else if (player.equals(player2id)) {
            player2id = null;
        } else {
            System.out.println("Error: Player not found.");
        }
    }
    public void listPlayers() {
        System.out.println("Players:");
        Object player1id = null;
        if (player1id != null) {
            System.out.println(player1id);
        }
        Object player2id = null;
        if (player2id != null) {
            System.out.println(player2id);
        }
    }
    public void outcome() {
//        if (!player1id.getTorpedoes().isEmpty() || !player2id.getTorpedoes().isEmpty()) if (player1id.getShips().isEmpty()) {
//            // Player 1 wins
//            System.out.println(player1id.getName() + " wins!");
//            player1id.setScore(player1id.getScore() + 2);
//        } else if (player2id.getShips().isEmpty()) {
//            // Player 2 wins
//            System.out.println(player2id.getName() + " wins!");
//            player2id.setScore(player2id.getScore() + 2);
//        } else {
//            // Tie condition
//            System.out.println("It's a tie!");
//            player1id.setScore(player1id.getScore() + 1);
//            player2id.setScore(player2id.getScore() + 1);
//        }
    }
     public void gameType(){
         // it will have the same condition as combPlayers
     }
}
    

