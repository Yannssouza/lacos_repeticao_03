package Ativades;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);
            int n, soma = 0;

            do {
                System.out.println("Digite um número: ");
                n = leia.nextInt();

                if (n > 0) {
                    soma += n;
                }

                System.out.println(soma);

            } while (n != 0);

            leia.close();

            System.out.println("A soma dos números positivos é:" + soma);
    }

}


