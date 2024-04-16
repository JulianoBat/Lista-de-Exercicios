package br.com.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        int num = scanner.nextInt();

        System.out.println("O antecessor de " + num + " é " + (num-1) + " e seu sucessor é " + (num+1) + ".");

    }
}
