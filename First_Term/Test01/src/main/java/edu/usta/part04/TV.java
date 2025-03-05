package edu.usta.part04;

public class TV extends Appliance {
    /**
     * Inherits from Appliance
     * 
     * Attributes of the TV class:
     * - inches: Integer
     * 
     * Methods of the TV class:
     * - Constructor without parameters
     * - Constructor with parameters
     * - Getters and Setters
     * - toString
     */
    private Integer inches;

    public TV() {
    }

    public TV(Integer cod, String brand, Double value, String amount, Integer inches) {
        super(cod, brand, value, amount);
        this.inches = inches;
    }

    public Integer getInches() {
        return inches;
    }

    public void setInches(Integer inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "TV [inches=" + inches + "]";
    }
}
