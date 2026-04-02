package com.mycompany.teste;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int temp;

        System.out.println("Digite os 5 valores do Vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os 5 valores do Vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            temp = A[i];
            A[i] = B[i];
            B[i] = temp;
        }

        System.out.print("\nVetor A: ");
        for (int i = 0; i < 5; i++){
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < 5; i++){
            System.out.print(B[i] + " ");
        }
    }
}