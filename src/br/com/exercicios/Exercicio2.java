package br.com.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        int num = scan.nextInt();
        int aux = num % 2;

        if(aux == 0 && num > 0){
            System.out.println("O número é par e positivo.");
        } else if (aux == 1 && num > 0) {
            System.out.println("O número é impar e positivo.");
        } else if (aux == 0 && num < 0){
            System.out.println("O número é par e negativo.");
        } else {
            System.out.println("O número é impar e negativo.");
        }
    }
}
