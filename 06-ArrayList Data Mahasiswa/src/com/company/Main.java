package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int banyak;
        double mean=0, total=0, sd, sd1, sd2=0, maksimum, minimum;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak mahasiswa: ");
        banyak = input.nextInt();

        ArrayList<String> nama = new ArrayList<String>(banyak);
        ArrayList<Integer> nilai = new ArrayList<Integer>(banyak);

        if (banyak <= 100) {

            //Input data mahasiswa
            for (int i = 0; i < banyak; i++) {
                System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
                System.out.print("Nama  : ");
                nama.add(input.next());
                System.out.print("Nilai : ");
                nilai.add(input.nextInt());

                total += nilai.get(i); //Mencari Total
                mean =  total / banyak; //Mencari Rata-rata
            }

            //Print daftar data mahasiswa
            System.out.println("\n=====Data Mahasiswa=====");
            for (int i = 0; i < banyak; i++) {
                System.out.println((i+1) + ". " + nama.get(i) + " " + nilai.get(i));
            }

            maksimum = nilai.get(0);
            minimum = nilai.get(0);

            for(int i = 0; i < banyak; i++) {
                if (nilai.get(i) > maksimum){ //Mencari nilai maksimum
                    maksimum = nilai.get(i);
                } else if (nilai.get(i) < minimum) { //Mencari nilai minimum
                    minimum = nilai.get(i);
                }
            }

            //Mencari Standar Deviasi
            for (int i=0; i < banyak; i++) {
                sd1 = Math.pow(nilai.get(i) - mean, 2);
                sd2 += sd1;
            }
            sd = Math.sqrt(sd2/banyak);

            //Print Perhitungan Nilai
            System.out.println("\nTotal Nilai : " + total);
            System.out.println("1. Rata-rata (mean) : " + mean);
            System.out.println("2. Nilai Tertinggi (max) : " + maksimum);
            System.out.println("3. Nilai Terendah (min) : " + minimum);
            System.out.println("4. Standar Deviasi : " + sd);
            System.out.print("5. Mahasiswa Nilai Tertinggi : ");
            for (int i = 0; i < banyak; i++) {
                if (nilai.get(i) == maksimum) {
                    System.out.print(nama.get(i) + " ");
                }
            }

            System.out.print("\n6. Mahasiswa Nilai Terendah  : ");
            for (int i = 0; i < banyak; i++) {
                if (nilai.get(i) == minimum) {
                    System.out.print(nama.get(i) + " ");
                }
            }

        } else {
            System.out.println("\nMaaf jumlah maksimal mahasiswa hanya 100");
        }

        System.out.println("\n");

    }

}

