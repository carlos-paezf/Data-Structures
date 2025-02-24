/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.usta.classes;

/**
 *
 * @author cpaez
 */
public class Product {
    // Definición de atributos
    private Integer cod;
    private String name;
    private Brand brand;
    private Double value;
    private Integer amount;

    // Definición de constructores
    public Product() {
    }

    public Product(Integer cod, String name, Brand brand, Double value, Integer amount) {
        this.cod = cod;
        this.name = name;
        this.brand = brand;
        this.value = value;
        this.amount = amount;
    }

    // Definición de Getters and Setters para consultar o modificar atributos
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
