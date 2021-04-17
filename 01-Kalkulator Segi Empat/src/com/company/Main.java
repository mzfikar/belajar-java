package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int panjang, lebar, luas, keliling;

        Scanner input = new Scanner(System.in);

        System.out.println("=====MENGHITUNG LUAS DAN KELILING SEGI EMPAT=====");
        System.out.print("Masukkan Panjang = ");
        panjang = input.nextInt();
        System.out.print("Masukkan Lebar = ");
        lebar = input.nextInt();

        //Rumus Menghitung Luas
        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        //Rumus Menghitung Keliling
        keliling = (2 * panjang) + (2 * lebar);
        System.out.println("Keliling = " + keliling);
    }
}
