package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriks1; int baris1, kolom1;
        int[][] matriks2; int baris2, kolom2;

        System.out.println("========== Kalkulator Penjumlahan 2 Matriks ==========");
        //Baca baris dan kolom Matriks A
        System.out.println("Matriks A");
        System.out.print("Masukkan baris : ");
        baris1 = input.nextInt();
        System.out.print("Masukkan kolom : ");
        kolom1 = input.nextInt();

        matriks1 = new int[baris1][kolom1];

        //Baca baris dan kolom Matriks B
        System.out.println("\nMatriks B");
        System.out.print("Masukkan baris : ");
        baris2 = input.nextInt();
        System.out.print("Masukkan kolom : ");
        kolom2 = input.nextInt();

        matriks2 = new int[baris2][kolom2];

        if (baris1 == baris2 && kolom1 == kolom2) {

            //isi matriks A
            System.out.println("\nIsi Matriks A");
            bacaMatriks(matriks1);

            //isi matriks B
            System.out.println("\nIsi Matriks B");
            bacaMatriks(matriks2);

            //Print matriks A
            System.out.println("\nMatriks A");
            printMatriks(matriks1);

            //Print matriks B
            System.out.println("\nMatriks B");
            printMatriks(matriks2);

            //Penjumlahan
            int[][] hasilPenjumlahan = tambah(matriks1,matriks2);

            //Print Hasil penjumlahan
            System.out.println("\nHasil penjumlahan matriks : ");
            printMatriks(hasilPenjumlahan);

        } else {
            System.out.println("\nMasukkan Salah!");
            System.out.println("Matriks tidak dapat dijumlahkan satu sama lain.");
        }

    }

    private static int[][] bacaMatriks(int[][] matriks) {
        int baris = matriks.length;
        int kolom = matriks[0].length;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen ke-[" + i + "," + j + "] =  ");
                matriks[i][j] = input.nextInt();
            }
        }

        return matriks;
    }

    private static void printMatriks(int[][] dataMatriks){
        int baris = dataMatriks.length;
        int kolom = dataMatriks[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for(int j = 0; j < kolom; j++){
                System.out.print(dataMatriks[i][j]);

                if (j < kolom - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("]");
                }

            }
            System.out.print("\n");
        }
    }

    private static int[][] tambah(int[][] matriks_A, int[][] matriks_B) {
        int baris = matriks_A.length;
        int kolom = matriks_A[0].length;

        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks_A[i][j] + matriks_B[i][j];
            }
        }

        return hasil;
    }

}