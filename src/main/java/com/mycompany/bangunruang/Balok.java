/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author USER
 */
public class Balok {
    int p ;
    int l ;
    int t ;
    
    double volume (){
      double hasil = p*l*t;
            System.out.println("HASIL VOLUME BALOK : " +hasil);
            return hasil;
}
    double luaspermukaan (){ 
        double hasil =  2*(p*l + p*t + l*t);
        System.out.println("HASIL LUAS PERMUKAAN BALOK : " + hasil);
        return hasil;
    }
}
