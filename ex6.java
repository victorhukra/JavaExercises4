package com.mycompany.lista4;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de bois: ");
        int n = sc.nextInt();
        int[] ids = new int[n];
        double[] pesos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\nBoi %d%n", i + 1);
            System.out.print("Numero de identificacao: ");
            ids[i] = sc.nextInt();
            System.out.print("Peso: ");
            pesos[i] = sc.nextDouble();
        }
        int indiceMaisGordo = 0;
        int indiceMaisMagro = 0;
        for (int i = 1; i < n; i++) {
            if (pesos[i] > pesos[indiceMaisGordo]) indiceMaisGordo = i;
            if (pesos[i] < pesos[indiceMaisMagro]) indiceMaisMagro = i;
        }
        System.out.printf("\nBoi mais gordo: ID %d | Peso %.2f%n", ids[indiceMaisGordo], pesos[indiceMaisGordo]);
        System.out.printf("Boi mais magro: ID %d | Peso %.2f%n", ids[indiceMaisMagro], pesos[indiceMaisMagro]);
    }
}