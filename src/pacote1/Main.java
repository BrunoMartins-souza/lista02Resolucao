package pacote1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int opc;

        System.out.print("Escolha uma opção: ");
        opc = input.nextInt();

        switch (opc) {
            case 1:
                for (int i = 0; i < 100; i++){}
                break;
        
            default:
                break;
        }

    }
}
