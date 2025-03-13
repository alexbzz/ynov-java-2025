package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
    }

    public static class EvenOrOdd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un nombre : ");
            int nombre = scanner.nextInt();
            if (nombre % 2 == 0) {
                System.out.println("Le nombre " + nombre + " est pair.");
            } else {
                System.out.println("Le nombre " + nombre + " est impair.");
            }
            scanner.close();
        }
    }
}