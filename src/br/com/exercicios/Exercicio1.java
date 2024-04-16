package br.com.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
//    Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma
//    entre A e B é mostre se a soma é menor que C.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = scan.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scan.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = scan.nextInt();

        int soma = a + b;
        if (soma > c ) {
            System.out.println("O resultado da soma de A + B é " + soma
                    + ", e é maior que o valor de C, que é " + c);
        } else if (soma < c) {
            System.out.println("O resultado da soma de A + B é " + soma
                    + ", e é menor que o valor de C, que é " + c);

        } else System.out.println("O resultado da soma de A + B é " + soma
                + ", e é igual ao valor de C, que é " + c);
    }

}
