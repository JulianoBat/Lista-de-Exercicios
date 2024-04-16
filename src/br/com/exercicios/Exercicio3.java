package br.com.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        //imprimir seu valor na tela.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor inteiro de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor inteiro de B:");
        int b = scanner.nextInt();
        int c;

        if(a == b){
            c = a + b;
            System.out.println("A é igual a B, portanto o valor de C é " + c);
        } else {
            c = a * b;
            System.out.println("A é diferente de B, portanto o valor de C é " + c);
        }
    }
}
