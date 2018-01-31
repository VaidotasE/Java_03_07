package com.company;

import java.util.Scanner;

public class Main {
    public int[] skaiciai;

    public void skaiciuIvedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("kiek nori ivesti skaiciu? ");
        int a = sc.nextInt();
        System.out.println("Ivesk " + a + " skaicius.");

        skaiciai = new int[a];


        for (int i = 0; i < skaiciai.length; i++) {

            skaiciai[i] = sc.nextInt();
        }
    }

    public void skaiciuParodymas() {

        for (int i = 0; i < skaiciai.length; i++) {
            if (skaiciai[i] < 100)
                System.out.println(skaiciai[i]);
        }
    }

    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.skaiciuIvedimas();
        objektas.skaiciuParodymas();

    }
}
