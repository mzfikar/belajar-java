package com.company;

import java.util.*;

public class Stack {
    String kalimat;
    int top = 0;
    char[] array;
    char[] stack;

    void push(char a) {
        stack[top] = a;
        top = top + 1;
    }

    char pop() {
        top = top - 1;
        return stack[top];
    }

    void inputKalimat() {
        Scanner input = new Scanner(System.in);

        System.out.println("========== PROGRAM CEK KALIMAT PALINDROM ==========");
        System.out.print("Masukkan kalimat : ");
        kalimat = input.nextLine();

        array = kalimat.toCharArray();
        stack = new char[array.length];
    }

    void pushx() {
        for(int i = 0; i < array.length; i++){
            char x = array[i];
            push(x);
        }
    }

    void printHasil() {
        boolean cek = false;
        for (int i = 0; i < array.length; i++){
            if (pop() == array[i]){
                cek = true;
            } else {
                cek = false;
                break;
            }
        }

        System.out.print("Hasil = ");
        for(int i = array.length; i >= 1; i--) {
            char y = array[i-1];
            System.out.print(y);
        }
        System.out.println();
        if (cek) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Bukan Palindrom");
        }
    }

}