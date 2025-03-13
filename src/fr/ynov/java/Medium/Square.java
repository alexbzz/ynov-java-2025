package fr.ynov.java.Medium;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrée un nombre : ");
        int m = scanner.nextInt();
        double result = m * m;
        System.out.println("Le carré de " + m + " est : " + result);
        scanner.close();
    }
}
