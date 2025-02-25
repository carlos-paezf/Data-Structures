package edu.usta.part04;

public class Fridge extends Appliance {
    /**
     * Inherits from Appliance
     * 
     * Attributes of the Fridge class:
     * - capacity: Integer
     * 
     * Methods of the Fridge class:
     * - Constructor without parameters
     * - Constructor with parameters
     * - Getters and Setters
     * - toString
     */
    private Integer capacity;

    public Fridge() {
    }

    public Fridge(Integer cod, String brand, Double value, String amount, Integer capacity) {
        super(cod, brand, value, amount);
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Fridge [capacity=" + capacity + "]";
    }
}
