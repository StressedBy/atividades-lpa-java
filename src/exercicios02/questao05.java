package exercicios02;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomePesquisar;
        boolean achouNome = false;
        String[] nomes = new String[10];

        System.out.println("Informe abaixo 10 nomes.");

        for(int i=0; i<nomes.length ; i++){
            if(i==0){
                System.out.println("Informe o primeiro nome:");
                nomes[i] = sc.next().toUpperCase();
            } else {
                System.out.println("Informe o próximo nome:");
                nomes[i] = sc.next().toUpperCase();
            }
        }

        System.out.println("Estes são os nomes inseridos na lista\n");
        for(int i=0; i<nomes.length ; i++){
            System.out.println(nomes[i]);
        }


        System.out.println("Procure um dos nomes inseridos:");
        nomePesquisar = sc.next().toUpperCase();


        for(int i=0; i<nomes.length ; i++){
            if(nomes[i].equals(nomePesquisar)){
                System.out.println("Você pesquisou por '"+nomePesquisar+"' que está na posição "+i+" da nossa lista. E foi o "+(i+1)+" número inserido");
                achouNome = true;
            }
        }
        if (achouNome == false){
            System.out.println("O nome inserido não corresponde aos nomes inseridos em nossa lista. Se atente a caracteres especiais ou o uso de espaço.");
        }
    }
}
