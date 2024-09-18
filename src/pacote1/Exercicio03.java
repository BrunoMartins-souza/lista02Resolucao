//Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo.
//Sabendo-se que este perde 25% de sua massa a cada 30 segundos. Criar um programa que
//calcule iterativamente e imprima o tempo necessário para que a massa deste material se torne
//menor que 0,10 grama. O programa pode calcular o tempo para várias massas.

package pacote1;

import java.util.Scanner;

public class Exercicio03 {
    public void exercicio03() {
        try (Scanner input = new Scanner(System.in)) {

            int tempo;
            Double massa;

            System.out.println("Digite a massa inicial do material (em gramas): ");
            massa = input.nextDouble();
            tempo = 0; 

            while (massa >= 0.10) {
                massa -= massa * 0.25;
                tempo += 30;
            }

            System.out.println("O tempo necessário para a massa se tornar menor que 0,10 é: " + tempo + " segundos.");

            


        }

    }

}
