package com.mycompany.lista4;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[5 - i];
            vetor[5 - i] = temp;
        }
        System.out.println("\nVetor invertido:");
        for (int i = 0; i < 6; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}