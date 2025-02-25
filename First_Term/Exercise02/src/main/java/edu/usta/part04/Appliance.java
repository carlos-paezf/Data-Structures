package edu.usta.part04;

public class Appliance {
    /**
     * Attributes of the Appliance class:
     * - cod: Integer
     * - brand: String
     * - value: Double
     * - amount: String
     *
     * Methods of the Appliance class:
     * - Constructor without parameters
     * - Constructor with parameters
     * - Getters and Setters
     * - hashCode
     * - equals
     * - toString
     */
    private Integer cod;
    private String brand;
    private Double value;
    private String amount;

    public Appliance() {
    }

    public Appliance(Integer cod, String brand, Double value, String amount) {
        this.cod = cod;
        this.brand = brand;
        this.value = value;
        this.amount = amount;
    }

    public Integer getCod() {
        return cod;
    }

    public String getBrand() {
        return brand;
    }

    public Double getValue() {
        return value;
    }

    public String getAmount() {
        return amount;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod == null) ? 0 : cod.hashCode());
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Appliance other = (Appliance) obj;
        if (cod == null) {
            if (other.cod != null)
                return false;
        } else if (!cod.equals(other.cod))
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else if (!amount.equals(other.amount))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Appliance [cod=" + cod + ", brand=" + brand + ", value=" + value + ", amount=" + amount + "]";
    }

}
