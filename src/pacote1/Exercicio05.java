//Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
// (a) a quantidade de pessoas com idade superior a 50 anos;
// (b) a média das alturas das pessoas com idade entre 10 e 20 anos;
//(c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.

package pacote1;

import java.util.Scanner;

public class Exercicio05 {
    public void exercicio05() {
        Scanner input = new Scanner(System.in);

            int idade;
            Double altura, peso;
            int totalPessoas = 10;
            int idadeMaior50 = 0;
            int pessoasEntre10e20 = 0;
            Double somaAlturaEntre10e20 = 0.0;
            int pesoMenor40 = 0;
            Double mediaAlturaEntre10e20;
            Double porcentagemPesoMenor40;

            for (int i = 1; i < totalPessoas; i++) {
                System.out.println("Pesoa " + i + ":");

                System.out.println("Digite a idade: ");
                idade = input.nextInt();

                System.out.println("Digite a altura (em metros): ");
                altura = input.nextDouble();

                System.out.println("Digite o peso (em quilos): ");
                peso = input.nextDouble();

                if (idade > 50) {
                    idadeMaior50++;
                }
                if (idade >= 10 && idade <= 20) {
                    somaAlturaEntre10e20 += altura;
                    pessoasEntre10e20++;
                }
                if (peso < 40) {
                    pesoMenor40++;
                }
            }

            System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + idadeMaior50);

            if (pessoasEntre10e20 > 0) {
                mediaAlturaEntre10e20 = somaAlturaEntre10e20 / pessoasEntre10e20;
                System.out
                        .println("Média das alturas das pessoas com idade entre 10 e 20 ano: " + mediaAlturaEntre10e20);
            } else {
                System.out.println("Nenhuma pessoa com idade entre 10 e 20 anos.");
            }
            porcentagemPesoMenor40 = (pesoMenor40 * 100.0) / totalPessoas;
            System.out.println("Porcentagem de pessoass com peso inferior a 40 kg: " + porcentagemPesoMenor40 + "%");

        input.close();

    }
}
