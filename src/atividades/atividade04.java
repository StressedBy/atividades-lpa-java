package atividades;

import java.util.Scanner;

public class atividade04 {

    public static void main(String[] args) {
        int anos, meses, dias, mediadedias;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cá estamos mais uma vez, professor.\n Agora, diga-me: Quanto você já viveu? \n Descobriremos a verdade a seguir: digite abaixo quantos anos de vida você tem");

        anos = sc.nextInt();

        System.out.println("Agora digite quantos meses já se passaram desde o seu último aniversário:");

        meses = sc.nextInt();

        System.out.println("E estamos em qual dia do mês?");

        dias = sc.nextInt();

        mediadedias = ((anos*12)+meses)*30+(dias);

        System.out.println(mediadedias);
    }
}
