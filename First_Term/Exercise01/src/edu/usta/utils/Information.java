/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.usta.utils;

import edu.usta.classes.Brand;

/**
 *
 * @author cpaez
 */
public class Information {

    /**
     * @return arrBrands - Arreglo estático con 5 marcas
     */
    public static Brand[] generateBrands() {
        Brand[] arrBrands = new Brand[5];
        arrBrands[0] = new Brand(1, "Adidas");
        arrBrands[1] = new Brand(2, "Nike");
        arrBrands[2] = new Brand(3, "Gucci");
        arrBrands[3] = new Brand(4, "Prada");
        arrBrands[4] = new Brand(5, "Levis");
        return arrBrands;
    }
}
