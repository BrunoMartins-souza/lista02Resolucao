//CrieumprogramaemJavaqueexiba formasgeométricasnatela. Ummenudeve ser exi
//bidocomasseguintesopções: retângulo,diagonalsuperioresquerda,diagonalsuperiordireita,
// diagonal inferioresquerda,diagonal inferiordireita.Asimagensdevemserformadasporaste
//riscos(*)e,apessoautilizadoradeveinformaraquantidadedecolunas.Abaixoestãoalguns
// exemplosdasformas:
// (a)
// 1 * * * * *
// 2 * * * * *
// 3 * * * * *
// 4 * * * * *
// 5 * * * * *
// (b)
// 1 * * * * *
// 2 * * * *
// 3 * * *
// 4 * *
// 5 *
// (c)
// 1 * * * * *
// 2 * * * *
// 3 * * *
// 4 * *
// 5 *
// (d)
// 1 *
// 2 * *
// 3 * * *
// 4 * * * *
// 5 * * * * *
// (e)
// 1 *
// 2 * *
// 3 * * *
// 4 * * * *
// 5 * * * * *

package pacote1;

import java.util.Scanner;

public class Exercicio07 {
    public void exercicio07() {
        try (Scanner input = new Scanner(System.in)) {

            int opc;
            int n;
            int i;
            int j;

            System.out.println("Escolha uma opção de forma geométrica:");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Diagonal Superior Esquerdo");
            System.out.println("3 - Diagonal Superior Direito");
            System.out.println("4 - Diagonal Inferior Esquerdo");
            System.out.println("5 - Diagonal Inferior Direito");
            opc = input.nextInt();

            System.out.println("Digite a quantidade de colunas (e linhas): ");
            n = input.nextInt();

            switch (opc) {
                case 1:
                    // Retângulo
                    for (i = 0; i < n; i++){
                        for(j = 0; j < n; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                break;
                case 2:
                    // Diagonal Superior Esquerda
                    for(i = 0; i < n; i++){
                        for(j = 0;j < n - i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                break;
                case 3:
                    // Diagonal Superior Direita
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < i; j++) {
                            System.out.print("  "); // Espaços antes da linha de asteriscos
                        }
                        for (j = 0; j < n - i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                break;
                case 4:
                    // Diagonal Inferior Esquerda
                    for (i = 0; i < n; i++) {
                        for (j = 0; j <= i; j++) {
                           System.out.print("* ");
                        }
                        System.out.println();
                    }
                break;
                case 5:
                    // Diagonal Inferior Direita
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n - i - 1; j++) {
                            System.out.print("  "); // Espaços antes da linha de asteriscos
                        }
                        for (j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                break;
                default:
                    System.out.println("Opção inválida.");
            }   
        }   
    }
}
