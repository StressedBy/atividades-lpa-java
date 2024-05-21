package exercicios02;
import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe abaixo o tamanho da sua lista:");
        int tamanhoLista = sc.nextInt();

        int[] numeros = new int[tamanhoLista];
        int somaLista = 0;

        for(int i=0 ; i<numeros.length ; i++){
            System.out.println("Digite agora um valor pra sua lista");
            numeros[i] =  sc.nextInt();
            somaLista += numeros[i];
        }
        System.out.println("O valor total de sua lista é: " + somaLista);
    }
}
