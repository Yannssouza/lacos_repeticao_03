package Ativades;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        int backend = 0;
        int mulheres = 0;
        int homens = 0;
        int binarios = 0;
        int total = 0;
        int somaIdades = 0;
        double media;
        char continuar = 's';

        Scanner leia = new Scanner(System.in);

        while (continuar == 's' || continuar == 'S') {
            System.out.println("Digite sua idade:");
            int idade = leia.nextInt();

            System.out.println("Identidade de Gênero:");
            System.out.println("1 – Mulher Cis");
            System.out.println("2 – Homem Cis");
            System.out.println("3 – Não Binário");
            System.out.println("4 – Mulher Trans");
            System.out.println("5 – Homem Trans");
            System.out.println("6 – Outros");
            System.out.println("Digite sua identidade de Gênero:");
            int genero = leia.nextInt();

            System.out.println("Pessoa Desenvolvedora:");
            System.out.println("1 – Backend");
            System.out.println("2 – Frontend");
            System.out.println("3 – Mobile");
            System.out.println("4 – FullStack");
            System.out.println("Digite seu tipo Desenvolvedor:");
            int desenvolvedor = leia.nextInt();

            if (desenvolvedor == 1) {
                backend++;
            }

            if ((genero == 1 || genero == 4) && desenvolvedor == 2) {
                mulheres++;
            }

            if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40) {
                homens++;
            }

            if (genero == 3 && desenvolvedor == 4 && idade < 30) {
                binarios++;
            }

            total++;
            somaIdades += idade;

            System.out.println("Deseja continuar (s/n):");
            continuar = leia.next().charAt(0);
        }

        System.out.println("Número de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheres);
        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homens);
        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + binarios);
        System.out.println("Número total de pessoas que responderam à pesquisa: " + total);

        media = (double) somaIdades / total;
        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + media);

        leia.close();
    }
}