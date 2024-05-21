package exercicios02;
import java.util.Scanner;

public class questao04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int maiorNumero = 0;

        System.out.println("Digite abaixo 10 números distintos. Te direi qual o maior deles.");

        for(int i=0; i<10 ; i++){
            if(i == 0){
                System.out.println("Digite o primeiro número:");
                numeros[i] = sc.nextInt();
            } else {
                System.out.println("Digite o próximo número:");
                numeros[i] = sc.nextInt();
            }
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        System.out.println("O maior número que você digitou foi "+maiorNumero);

    }
}
