import java.util.Scanner;

import pacote1.Exercicio01;
import pacote1.Exercicio02;
import pacote1.Exercicio03;
import pacote1.Exercicio04;
import pacote1.Exercicio05;
import pacote1.Exercicio06;
import pacote1.Exercicio07;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int opc;

        do{
            System.out.println("Escolha uma opção para mostrar o resultado do exercício: ");
            System.out.println(" 1 - Exercício 01");
            System.out.println(" 2 - Exercício 02");
            System.out.println(" 3 - Exercício 03");
            System.out.println(" 4 - Exercício 04");
            System.out.println(" 5 - Exercício 05");
            System.out.println(" 6 - Exercício 06");
            System.out.println(" 7 - Exercício 07");
            System.out.println(" 8 - Sair.");
            //input.skip("[\r\n]");
            opc = input.nextInt();
            //input.skip("[\r\n]");
                
            switch (opc) {
                case 1:
                    Exercicio01 e01 = new Exercicio01();
                    e01.exercicio01();
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
                case 6:
                    Exercicio06 e06 = new Exercicio06();
                    e06.exercicio06();
                    break;
                case 7:
                    Exercicio07 e07 = new Exercicio07();
                    e07.exercicio07();
                    break;
                case 8:
                    System.out.println("Saindo do programa...");
                    break;
              
                default:
                    System.out.println("Opção inválida. Escolha um número entre 1 e 8.");
                    break;
            }
            input.skip("[\r\n]");
        }while(opc != 8);
        
    }
}
       