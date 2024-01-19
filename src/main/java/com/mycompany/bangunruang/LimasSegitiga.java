/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author USER
 */
public class LimasSegitiga {
    int l;
    int t;
    int la;
    int ts;
    
    
    double volume(){
        double hasil = l*t/3;
        System.out.println("HASIL VOLUME LIMAS SEGITIGA : "+ hasil);
        return hasil;
    }
        double luasPermukaan (){
        double hasil = la+ts;
        System.out.println("HASIL LUAS PERMUKAAN LIMAS : " + hasil);
        return hasil;
    }
    
    }

