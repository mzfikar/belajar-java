package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int banyak;

        Mahasiswa[] mhs;

        System.out.print("Masukkan banyak mahasiswa: ");
        banyak = input.nextInt();

        mhs = new Mahasiswa[banyak];

        //Membaca data dari input keyboard user
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
            mhs[i] = new Mahasiswa();

            System.out.print("NIM   : ");
            mhs[i].nim = input.next();

            System.out.print("Nama  : ");
            mhs[i].nama = input.next();

            System.out.print("Nilai : ");
            mhs[i].nilai = input.nextInt();
        }

        //Print hasil data
        System.out.println("\n=====Data Mahasiswa=====");
        for (Mahasiswa mh : mhs) {
            System.out.println(mh.nim + " " + mh.nama + " " + mh.nilai);
        }

    }
}
