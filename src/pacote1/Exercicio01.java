//Crie um programa que imprima a sequência dos 100 próximos números inteiros, seguintes a um
//valor fornecido pela pessoa utilizadora.

package pacote1;
import java.util.Scanner;

public class Exercicio01 {
    public void exercicio01() {
        Scanner input = new Scanner(System.in);
            int valor01;

            System.out.println("Digite um número: ");
            valor01 = input.nextInt();

            for(int i = 0; i < 100; i++){
                valor01 = valor01 + 1;
                System.out.println(i + 1 + "° = " + valor01);
            }
        input.close();

    }

    
}