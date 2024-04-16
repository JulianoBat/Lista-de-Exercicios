package br.com.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um salário: ");
        double salario = scanner.nextDouble();
        double smin = salario / 1293.20;

        System.out.printf("O salario de " + salario + " corresponde à %.0f salários minimo.", smin);
    }
}
