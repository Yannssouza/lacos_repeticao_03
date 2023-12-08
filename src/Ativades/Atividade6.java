package Ativades;

import java.util.Scanner;

public class Atividade6 {

    static public void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, qtd = 0, multi = 0;

        do {
            System.out.println("Digite um número: ");
            n = leia.nextInt();

            if (n % 3 == 0 && n !=0) {
                multi += n;
                qtd++;
            }

        } while (n != 0);

        double media = (double) multi / qtd;

        leia.close();

        System.out.println("A média de todos os números múltiplos de 3 é: " + media);
    }
}
