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
    private Integer codBrand;
    private String nameBrand;

    public Brand() {
    }

    public Brand(Integer cod, String name) {
        this.codBrand = cod;
        this.nameBrand = name;
    }

    public Integer getCodBrand() {
        return codBrand;
    }

    public void setCodBrand(Integer codBrand) {
        this.codBrand = codBrand;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    @Override
    public String toString() {
        return "Brand{" + "codBrand=" + codBrand + ", nameBrand=" + nameBrand + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.codBrand);
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
        if (!Objects.equals(this.nameBrand, other.nameBrand)) {
            return false;
        }
        return Objects.equals(this.codBrand, other.codBrand);
    }    
}
