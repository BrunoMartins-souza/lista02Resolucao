package pacote2;
import java.util.Scanner;

public class Exercicio01 {
    public void exercio01() {
        try (Scanner input = new Scanner(System.in)) {
            int valor01;

            System.out.println("Digite um número: ");
            valor01 = input.nextInt();

            for(int i = 0; i < 100; i++){
                valor01 = valor01 + 1;
                System.out.println(i + 1 + "° = " + valor01);
            }
        }

    }

    
}