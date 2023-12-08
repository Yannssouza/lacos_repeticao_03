package Ativades;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        int pares = 0, impares = 0;

        Scanner leia = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º" + " número:");
            int n = leia.nextInt();

            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);
    }

}
