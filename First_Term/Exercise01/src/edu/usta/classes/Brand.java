/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.usta.classes;

import java.util.Objects;

/**
 *
 * @author cpaez
 */
public class Brand {
    // Definición de variables
    private Integer cod;
    private String name;

    // Definición de constructores
    public Brand() {
    }

    public Brand(Integer cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    // Definición de Setters y Getters para obtener y modificar variables de la
    // clase
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer codBrand) {
        this.cod = codBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameBrand) {
        this.name = nameBrand;
    }

    // Sobreescritura de métodos propios de las clases en JAVA
    @Override
    public String toString() {
        return "Brand{" + "codBrand=" + cod + ", nameBrand=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.cod);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Brand other = (Brand) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.cod, other.cod);
    }
}
