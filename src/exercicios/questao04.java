package exercicios;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeiroNumero, segundoNumero ;

        System.out.println("Digite dois números inteiros que mostrarei todos os números do menor ao maior\nInsira aqui o primeiro número:");
        primeiroNumero =  sc.nextInt();
        System.out.println("Agora o segundo número:");
        segundoNumero =  sc.nextInt();

        if(primeiroNumero > segundoNumero){
            System.out.println("Estes são todos números inteiros contidos entre ["+segundoNumero+","+primeiroNumero+"]");
            for(int i = segundoNumero; i <= primeiroNumero ; i++ ){
                System.out.println(i);
            }
        } else {
            System.out.println("Estes são todos números inteiros contidos entre ["+primeiroNumero+","+segundoNumero+"]");
            for(int i = primeiroNumero; i <= segundoNumero ; i++ ){
                System.out.println(i);
            }
        }
    }
}
