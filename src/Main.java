
import java.util.Scanner;

import pacote1.Exercicio01;
import pacote1.Exercicio02;
import pacote1.Exercicio03;
import pacote1.Exercicio04;
import pacote1.Exercicio05;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int opc;

            System.out.print("Escolha uma opção: ");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    Exercicio01 e01 = new Exercicio01();
                    e01.exercio01();
                break;
                case 2:
                    Exercicio02 e02 = new Exercicio02();
                    e02.exercicio02();
                break;
                case 3:
                    Exercicio03 e03 = new Exercicio03();
                    e03.exercicio03();
                break;
                case 4:
                    Exercicio04 e04 = new Exercicio04();
                    e04.exercicio04();
                break;
                case 5:
                    Exercicio05 e05 = new Exercicio05();
                    e05.exercicio05();
                break;


                default:
                    break;
            }
        }

    }
}
