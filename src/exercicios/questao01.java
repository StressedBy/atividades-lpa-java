package exercicios;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 0, j = 0, numero, somaImpar = 0, mediaImpar = 0;
        int[] pares = new int[10];
        int[] impares = new int[1000];


        System.out.println("Digite até quantos números inteiros quiser e selecionarei os 10 primeiros números pares!");

            while( i < 10 ){

                if( i == 0 && j == 00){
                    System.out.println("Digte o primeiro número: ");
                    numero = sc.nextInt();

                    if (numero % 2 == 0) {
                        pares[i] = numero;
                        i++;
                    } else {
                        impares[j] = numero;
                        somaImpar += numero;
                        j++;
                    } } else {
                System.out.println("Digte o próximo número: ");
                numero = sc.nextInt();

                    if (numero % 2 == 0) {
                        pares[i] = numero;
                        i++;
                    } else {
                        impares[j] = numero;
                        somaImpar += numero;
                        j++;
                    }
                }
            }

            System.out.println("Com minha magia antiga te mostrarei agora os números pares digitados, que são:");
            for( long par : pares){
                System.out.println(par);
            }

        System.out.println("Com minha magia antiga te mostrarei agora os números impares digitados, que são:");
        for( int contadorImpares = 0 ; contadorImpares < j ; contadorImpares++ ){
        System.out.println(impares[contadorImpares]);
        }

        if (j > 0) {
            mediaImpar = somaImpar / j;
            System.out.println("A média dos números impares é: " + mediaImpar);
        } else {
            System.out.println("Você não digitou nenhum número impar.");
        }
    }
}
