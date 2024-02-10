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
public class Ship {
    
    private int size;
    private int value;
    private int id;
    private int health;

    public Ship(int size, int value, int id) {
        this.size = size;
        this.value = value;
        this.id = id;
        this.health = size;
    }

    // Getters and setters...

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Method to move or rotate the ship
    public void moveRotateShip() {
        // Implementation of moveRotateShip method
    }

    // Method to check if the ship is sunk
    public boolean isShipSunk() {
        return health <= 0;
    }

    // Method to get the remaining health of the ship
    public int getRemainingHealth() {
        return health;
    }

    // Method to add a ship to the association
    public void addShip(List<Ship> ships, Ship ship) {
        // Check if maximum number of ships has been reached
        if (ships.size() < 10) { // Assuming a maximum of 10 ships
            ships.add(ship);
        } else {
            System.out.println("Error: Maximum number of ships reached.");
        }
    }

    // Method to remove a ship from the association
    public void removeShip(List<Ship> ships, Ship ship) {
        // Check if ship exists in the list
        if (ships.contains(ship)) {
            ships.remove(ship);
        } else {
            System.out.println("Error: Ship not found.");
        }
    }

    // Method to list all objects participating in the association
    public void listShips(List<Ship> ships) {
        System.out.println("Ships:");
        for (Ship ship : ships) {
            System.out.println("Ship ID: " + ship.getId() +
                    ", Size: " + ship.getSize() +
                    ", Value: " + ship.getValue() +
                    ", Remaining Health: " + ship.getRemainingHealth());
        }
    }
    
}
