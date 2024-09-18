package pacote1;

import java.util.Scanner;

import pacote2.Exercicio01;

public class Main {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int opc;

            System.out.print("Escolha uma opção: ");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    Exercicio01 e01 = new Exercicio01();
                    e01.exercio01();
                    break;
            
                default:
                    break;
            }
        }

    }
}
