package exercicios;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, divisores = 0;

        System.out.println("Digite um número inteiro");
        numero = sc.nextInt();

        if (numero < 0){
            System.out.println("O número precisa ser positivo");
        } else if ( numero == 0 ) {
            System.out.println("A quantidade de divisores de 0 é 0");
        } else {
            System.out.println("Os divisores de " + numero + " são:");
            for(int i = 1 ; i <= numero ; i++) {
                if( numero % i == 0 ){
                    System.out.println(i);
                    divisores++;
                }
            }
            System.out.println("O número tem " + divisores + " divisores.");
            if( divisores == 2){
                System.out.println("Portanto é um número primo, divisivel por 1 ou ele mesmo.");
            }
        }
    }
}