package com.mycompany.lista4;
import java.util.Scanner;
import java.util.ArrayList;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        String[] cursos = new String[5];
        int[] idades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1));

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Curso: ");
            cursos[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = Integer.parseInt(sc.nextLine()); 
        }

        boolean encontrou = false;

        System.out.println("\nAlunos com mais de 21 anos ");

        for (int i = 0; i < 5; i++) {
            if (idades[i] > 21) {
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Curso: " + cursos[i]);
                System.out.println("Idade: " + idades[i]);
                encontrou = true;
            }
        }

        if (encontrou == false) {
            System.out.println("Nenhum aluno tem mais de 21 anos");
        }

    }
}