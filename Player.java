/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdiagramclasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jalan
 */
public class Player {
    
     private int pid;
    private String name;
    private int score;
    private List<Torpedo> torpedoes;
    private List<Ship> ships;

    public Player(int pid, String name, int score) {
        this.pid = pid;
        this.name = name;
        this.score = score;
        this.torpedoes = new ArrayList<>();
        this.ships = new ArrayList<>();
    }

    // Getters and setters
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Torpedo> getTorpedoes() {
        return torpedoes;
    }

    public void setTorpedoes(List<Torpedo> torpedoes) {
        this.torpedoes = torpedoes;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }
    
     // Method to get the number of ships
    public int numberOfShips() {
        return ships.size();
    }

    // Method to get the number of torpedoes
    public int numberOfTorps() {
        return torpedoes.size();
    }

    // Method to pause the battle
    public void pauseBattle() {
        // Add logic to pause the battle
        System.out.println("Battle paused");
    }
    
        public void addShip(Ship ship) {
        if (ships.size() < 10) { // Assuming a maximum of 10 ships
            ships.add(ship);
        } else {
            System.out.println("Error: Maximum number of ships reached.");
        }
    }

    // Method to remove a ship
    public void removeShip(Ship ship) {
        if (ships.contains(ship)) {
            ships.remove(ship);
        } else {
            System.out.println("Error: Ship not found.");
        }
    }

    // Method to add a torpedo
    public void addTorpedo(Torpedo torpedo) {
        if (torpedoes.size() < 20) { // Assuming a maximum of 20 torpedoes
            torpedoes.add(torpedo);
        } else {
            System.out.println("Error: Maximum number of torpedoes reached.");
        }
    }

    // Method to remove a torpedo

    /**
     *
     * @param torpedo
     */
    public void removeTorpedo(Torpedo torpedo) {
        if (torpedoes.contains(torpedo)) {
            torpedoes.remove(torpedo);
        } else {
            System.out.println("Error: Torpedo not found.");
        }
    }
    
    public void listObjects() {
        System.out.println("Ships:");
        for (Ship ship : ships) {
            System.out.println(ship);
        }
        
        System.out.println("Torpedoes:");
        for (Torpedo torpedo : torpedoes) {
            System.out.println(torpedo);
        }
    }
    
}
