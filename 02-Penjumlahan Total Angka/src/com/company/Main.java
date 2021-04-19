package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka, total = 0;
        char ulamg;
        boolean kondisi;

        System.out.println("=====PROGRAM MENGHITUNG TOTAL ANGKA=====");

        do {
            System.out.print("Masukkan Angka : ");
            angka = input.nextInt();
            total = total + angka; //Penjumlahan setiap angka yang diinput oleh user

            do {
                System.out.print("Tambah Lagi? ");
                ulamg = input.next().charAt(0); //Menginput sebuah char

                //Mengecek apakah user ingin mengulang atau tidak
                if (ulamg == 'Y') {
                    kondisi = true;
                    break;
                } else if (ulamg == 'T'){
                    kondisi = false;
                    break;
                } else {
                    System.out.println("Masukkan Salah! Ulangi (Y/T)");
                }

            } while (true);

        } while (kondisi);

        System.out.println("\nTotal Angka = " + total);

    }

}
