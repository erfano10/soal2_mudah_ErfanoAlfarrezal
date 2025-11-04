/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soal2_mudah;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class Soal2_mudah {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("No 2  soal mudah");

        int bilangan1;
        System.out.println("Masukkan Bilangan : ");
        bilangan1 = inputan.nextInt();

        if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan Genap : ");
            System.out.println("Bilangan ini bisa dibagi 2");
        } else {
            System.out.println("Bilangan Ganjil");
            System.out.println("Bilangan ini tidak bisa " + "dibagi 2");
            System.out.println("Karena hasil bagi sisa 1");
        }
    }
}
