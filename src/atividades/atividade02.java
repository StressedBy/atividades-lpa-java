package atividades;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, nome2;

        System.out.println("Olá, sou seu computer , qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Seja bem-vindo, " + nome + ". Você poderia me dar um nome?");
        nome2 = sc.nextLine();
        System.out.println("Antigos espirítos do mal, transformem essa forma decadente em " + nome2);
    }
}
