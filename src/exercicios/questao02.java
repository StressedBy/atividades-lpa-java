package exercicios;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro qualquer");

        numero = sc.nextInt();

        for(int i = 0 ;i<=numero;i++){
            System.out.println(i);
        }
    }
}
