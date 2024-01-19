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
public class Tabung {
   double r;
   int t;
    
    double volume(){
        double hasil = PI*r*r;
        System.out.println("HASIL VOLUME TABUNG : " + hasil);
        return hasil;
        
    }
    double luasPermukaan (){
        double hasil = 2*PI*r*t + 2*PI*r*r;
        System.out.println("HASIL LUAS PERMUKAAN TABUNG : " + hasil);
        return hasil ;
    }
}
