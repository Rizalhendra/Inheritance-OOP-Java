/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

import static java.lang.Math.PI;

/**
 *
 * @author USER
 */
public class Bola extends BangunRuang {
    double r ;
    
    double volume(){
        double hasil = 4/3 *Math.PI * r * r * r;
           System.out.println("HASIL VOLUME BOLA : " + hasil);
        return hasil;
    }
    double luasPermukaan(){
        double hasil = 4*PI * r * r ;
        System.out.println("Hasil LUAS PERMUKAAN BOLA : " + hasil);
        return hasil;
    }
}

