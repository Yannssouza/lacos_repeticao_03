package Ativades;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        int pessoas = 0, menores = 0, maiores = 0;

        Scanner leia = new Scanner(System.in);

        while (pessoas <= 10) {
            System.out.println("Digite uma idade:");
            int n = leia.nextInt();

            if (n > 50) {
                maiores++;
            } else if (n < 21 && n > 0 ) {
                menores++;
            }
            pessoas++;
        }

        System.out.println("Total de pessoas menores de 21: " + menores);
        System.out.println("Total de pessoas maiores de 50: " + maiores);
    }

}
