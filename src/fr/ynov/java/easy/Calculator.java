package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrée un nombre : ");
        int m = scanner.nextInt();
        System.out.print("Entrée un autre nombre : ");
        int n = scanner.nextInt();
        System.out.print("Entrée un opérateur (+, -, *, /) : ");
        String op = scanner.next();
        double result = 0;
        switch (op) {
            case "+":
                result = m + n;
                break;
            case "-":
                result = m - n;
                break;
            case "*":
                result = m * n;
                break;
            case "/":
                if (n != 0) {
                    result = (double) m / n;
                } else {
                    System.out.println("Err : impossible de divisé par zéro.");
                    scanner.close();
                    return;
                }
                break;
        }
        System.out.println("Le résultat de " + m + " " + op + " " + n + " est : " + result);
        scanner.close();
    }
}
