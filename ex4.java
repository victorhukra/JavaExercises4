// 4-) Crie um vetor A que receberá 5 valores digitados pelo usuário e um vetor B 
// que também irá receber 5 valores digitados pelo usuário, na sequencia os 
// valores do Vetor A deveram ser transferidos para o Vetor B e os do Vetor B 
// transferidos para o Vetor A (Utilizar a estrutura FOR e somente 2 vetores). 

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
