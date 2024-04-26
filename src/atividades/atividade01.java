package atividades;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.println("Olá, sou seu computer , qual o seu nome?");

        nome = sc.nextLine();

        System.out.println("Seja bem-vindo, " + nome + ".");
    }
}