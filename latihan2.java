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
public class latihan2 {
    //Latihan2
    public static void hitung(int a, int b) {
    System.out.println((a+b));
 }
    public static void nilai(){
    System.out.println("nilai a dan b adalah" );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai a : ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai b: ");
        int b = input.nextInt();

        nilai();
        hitung(a, b);
      

       

    }}

