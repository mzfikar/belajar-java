package com.company;

import java.util.Scanner;

public class Main {

    public static int hitungFPB(int a, int b) {
        if (b == 0)
            return a;
        return hitungFPB(b, a % b);
    }

    public static int FPB(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            temp = hitungFPB(temp, array[i]);
        }
        return temp;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int banyak;
        char ulang;
        boolean kondisi = true;

        System.out.println("========== Program Mencari Nilai FPB ==========");

        while (kondisi) {

            System.out.print("\nMasukkan banyak bilangan : ");
            banyak = input.nextInt();

            int[] nilai = new int[banyak];

            if (banyak >= 2) {
                for (int i=0; i < nilai.length; i++) {
                    System.out.print("Masukkan bilangan ke-" + (i+1) + " : ");
                    nilai[i] = input.nextInt();
                }

                System.out.println("FPB-nya adalah " + FPB(nilai.clone()));

                System.out.print("\nUlangi? (Y/T) : ");
                ulang = input.next().charAt(0);

                if (ulang == 'Y') {
                    kondisi = true;
                } else {
                    kondisi = false;
                }

            } else {
                System.out.println("Banyak harus lebih dari 1 bilangan!");
            }

        }

    }

}
