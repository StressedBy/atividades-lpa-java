package atividades;

import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
    float farenheit, centigrados;

    Scanner sc = new Scanner(System.in);

    System.out.print("Nos encontramos mais uma vez. Usarei da magia antiga para converter graus celsius em farenheit! \n OBSERVE!!!");

    centigrados = sc.nextFloat();

    farenheit = ((9*centigrados)+160)/5;

    System.out.print("A temperatura em farenheit é " + String.format("%.2f", farenheit) + " farenheits");


    }
}
