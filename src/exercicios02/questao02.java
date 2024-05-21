package exercicios02;
import java.util.Scanner;

public class questao02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for(int i=0 ; i<10 ; i++){
            if(i != 0){
                System.out.println("Digite o próximo número:");
                numeros[i] = sc.nextInt();
            } else {
                System.out.println("Digite o primeiro número:");
                numeros[i] = sc.nextInt();
            }
        }
        System.out.println("Esses foram os números digitados por você:");
        for (int i=0; i<10 ; i++) {
            if(i!=9) {
                System.out.print(numeros[i] + ", ");
            } else {
                System.out.print(numeros[i] + ".");
            }
        }
    }
}
