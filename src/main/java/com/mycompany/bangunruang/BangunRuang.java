/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bangunruang;

/**
 *
 * @author USER
 */
public class BangunRuang {

    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.r=7;
        
        bola.volume();
        bola.luasPermukaan();
        System.out.println("");
        
        Balok balok = new Balok ();
        balok.p=10;
        balok.l=15;
        balok.t=12;
        
        balok.volume();
        balok.luaspermukaan();
        System.out.println("");
        
       LimasSegitiga limas = new LimasSegitiga();
       limas.l=7;
       limas.t=10;
       limas.la=15;
       limas.ts=10;
       
       limas.volume();
       limas.luasPermukaan();
        System.out.println("");
        
        
        Tabung tabung = new Tabung ();
        tabung.r=7;
        tabung.t=10;
        
        tabung.volume();
        tabung.luasPermukaan();
        System.out.println("");
        
        
     
     
     
    }
}
