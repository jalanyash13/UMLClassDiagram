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
class Torpedo {
     private int xCoordinate;
    private int yCoordinate;
    private int id;
    private int weight;

    public Torpedo(int xCoordinate, int yCoordinate, int id, int weight) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.id = id;
        this.weight = weight;
    }

    // Getters and setters...

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Method to update the coordinates of the torpedo
    public void updateCoordinates(int newX, int newY) {
        this.xCoordinate = newX;
        this.yCoordinate = newY;
    }

    // Method to check if the torpedo hit
    public boolean isHit() {
        // Your logic here to determine if the torpedo hit
        return false;
    }

    // Method to check if the torpedo missed
    public boolean isMiss() {
        // Your logic here to determine if the torpedo missed
        return false;
    }
    public void addTorpedo(List<Torpedo> torpedoes, Torpedo torpedo) {
        if (torpedoes.size() < 20) { // Assuming a maximum of 20 torpedoes
            torpedoes.add(torpedo);
        } else {
            System.out.println("Error: Maximum number of torpedoes reached.");
        }
    }

    // Method to remove a torpedo
    public void removeTorpedo(List<Torpedo> torpedoes, Torpedo torpedo) {
        if (torpedoes.contains(torpedo)) {
            torpedoes.remove(torpedo);
        } else {
            System.out.println("Error: Torpedo not found.");
        }
    }
     public void listTorpedoes(List<Torpedo> torpedoes) {
        System.out.println("Torpedoes:");
        for (int i = 0; i < torpedoes.size(); i++) {
            Torpedo torpedo = torpedoes.get(i);
            System.out.println("Torpedo ID: " + torpedo.getId() +
                    ", Coordinates: (" + torpedo.getXCoordinate() + ", " + torpedo.getYCoordinate() + ")");
        }
    }
}
