//Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro),
 //ou seja, A*B, por intermédio de adições sucessivas. Tanto A quanto B devem ser fornecidos
 //pela pessoa utilizadora do programa.

 package pacote1;
import java.util.Scanner;

public class Exercicio02 {
    public void exercicio02(){

        Scanner input = new Scanner(System.in);

        Double numA;
        int numB;
        Double resultado = 0.0;

        System.out.print("Digite um número real (A): ");
        numA = input.nextDouble();
        System.out.println("Digite um número inteiro (B): ");
        numB = input.nextInt();

        for(int i = 0; i < Math.abs(numB); i++){
            resultado += numA;
        }

        if (numB < 0){
            resultado = -resultado;
        }

        System.out.println("O produto de " + numA + " por " + numB + " é: " + resultado);
        
    }

    
    
}
