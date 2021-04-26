package com.company;

import java.util.Scanner;

public class Main {

    static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        } else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, j=0;

        System.out.println("========== Program Deret Fibonacci ==========\n");
        System.out.print("Masukkan banyak suku ke-n : ");
        n = input.nextInt();

        System.out.printf("Un = U%d\n",n);
        System.out.println("Hasil bilangan deret Fibonacci: ");
        for (int i = 0; i < n; i++){
            System.out.print(fibonacci(j));
            if (i < n - 1) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
            j++;
        }

    }
}