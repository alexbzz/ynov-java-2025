package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrée vôtre nom : ");
        String nom = scanner.nextLine();
        System.out.print("Entrée vôtre âge : ");
        int age = scanner.nextInt();
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
        EvenOrOdd.main(args);
    }
    public static class EvenOrOdd {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrée un nombre : ");
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
