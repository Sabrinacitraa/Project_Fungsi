/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class latihan1 {
    public static void luaslingkaran(double jari){
        double luas = 3.14*jari*jari;
        System.out.println("Luas lingkaran " + luas);       
    }
    
    public static double luaslingkaran2(double jari){       
        double luas = 3*jari*jari;
        return luas;
        
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai jari-jari: ");
        int jari = input.nextInt();
        luaslingkaran2(jari);
        
        //untuk yang tanpa void atau tipe data
        System.out.println("Luas lingkaran: " + luaslingkaran2(jari));
        
        latihan1 saya = new latihan1();
        saya.luaslingkaran2(5.0);
        
}}
