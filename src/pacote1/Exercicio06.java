//Emumcampeonato de LOL, enquanto não há a tomada de território, o contador implementado
// deve contar (que é contabilizado pelo jogo), o número de kills, deaths e assists. Se o número
// de kills for menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais
// “master”. Se o número de deaths chegar a 20 ou mais, ele mostra a mensagem “Houston,
// we have a problem”. Se o número de assists chegar a 20 ou mais, é mostrada a mensagem:
// “team work”. Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
// • há kills, deaths e assists total e da rodada
// • medite na frase: enquanto não há um vencedor, faça?
// • pergunte a cada loop o número de cada medida comentada.
// • você deve perguntar se há um vencedor a cada loop?

package pacote1;

import java.util.Scanner;

public class Exercicio06 {
    public void exercicio06() {
        try (Scanner input = new Scanner(System.in)) {

            int kills = 0;
            int deaths = 0;
            int assists = 0;
            int totalKills = 0;
            int totalDeaths = 0;
            int totalAssists = 0;
            String resposta;
            boolean vencedor = false;

            while (!vencedor) {
                System.out.println("Digite o número de kills da rodada: ");
                kills = input.nextInt();
                System.out.println("Digite o número de deathss da rodada: ");
                deaths = input.nextInt();
                System.out.println("Digite o número de assists da rodada: ");
                assists = input.nextInt();

                totalKills += kills;
                totalDeaths += deaths;
                totalAssists += assists;

                if (totalKills <= 5) {
                    System.out.println("noob");
                } else if (totalKills >= 20) {
                    System.out.println("master");
                }
                if (totalDeaths >= 20) {
                    System.out.println("Houston, we have a problem");
                }
                if (totalAssists >= 20) {
                    System.out.println("team work");
                }
                // input.skip("[\r\n]");
                input.nextLine();

                System.out.println("Há um vencedor? (s/n) ");
                resposta = input.nextLine();

                if (resposta.equalsIgnoreCase("s")) {
                    vencedor = true;
                }
            }

            System.out.println("O jogo terminou! Um vencedor foi definido.");

        }
    }
}
