package atividades;

import java.util.Scanner;

public class atividade03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomealuno;

        float nota1, nota2, media;

        System.out.println("Olá, professor, eu sou Mun-Ra, seu assistente. Hoje iremos analisar a nota de qual aluno?");

        nomealuno = sc.nextLine();

        System.out.println("Insira aqui a primeira nota da unidade:");

        nota1 = sc.nextFloat();

        System.out.println("Agora insira a segunda nota:");

        nota2 = sc.nextFloat();

        media = (nota1 + nota2)/2;

            if(media>=6) {
                System.out.println(nomealuno + " passou, a sua média é: " + media);
            } else {
                System.out.println(nomealuno + " foi reprovado, sua média é: " + media);
            }
    }
}