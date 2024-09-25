// Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números
 //ímpares e a soma dos números pares. Observação: O programa será encerrado quando um
 //valor negativo for inserido.

package pacote1;
import java.util.Scanner;

public class Exercicio04 {
    public void exercicio04(){
        Scanner input = new Scanner(System.in);

            int numero;
            int somaPares = 0;
            int produtoImpares = 1;
            boolean temImpares = false;

            while (true) {
                System.out.println("Digite um número inteiro positivo (ou um número negativo para sair): ");
                numero = input.nextInt();

                if (numero < 0) {
                    break;
                }
                if (numero % 2 == 0) {
                    somaPares += numero;
                }else{
                    produtoImpares *= numero;
                    temImpares = true;
                }
            }

            System.out.println("A soma dos números pares é: " + somaPares);
            if (temImpares) {
                System.out.println("O produto dos números ímpares é: " + produtoImpares);
            }else{
                System.out.println("Não foram inseridos números ímpares.");
            }

        input.close();
    }
}
