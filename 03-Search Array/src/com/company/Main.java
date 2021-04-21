package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        int[] array = new int[] {1,5,7,9,10,12,14,16,20,5,6,7,10,5};
        int[] posisi = new int[50];
        int angka, banyak = 0;
        boolean ketemu = false;

        System.out.print("Masukkan angka yang ingin dicari (1-20): ");
        angka = input.nextInt();

        //Sequential Search
        for (int i = 0; i < array.length; i++) {
            if (array[i] == angka) {
                ketemu = true;
                posisi[banyak] = i;
                banyak++;
            }
        }

        if (ketemu) {
            System.out.print("ADA! sebanyak " + banyak + " pada indeks ke ");
            for (int i = 0; i < banyak; i++){
                System.out.print(posisi[i]);
                if (i < banyak - 1) {
                    System.out.print(",");
                } else {
                    System.out.print(" ");
                }
            }
        } else {
            System.out.println("TIDAK ADA!");
        }

    }

}