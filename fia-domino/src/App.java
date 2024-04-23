import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();

        Object jogadorInicial = jogo.controle.jogadorInicial();

        int i = 0;
        while (jogo.controle.isPartidaEmAndamento()) {
            jogo.controle.printJogadorDaVez();
            // System.out.println("--- Rodada " + (i + 1) + " ---\n");
            jogo.tabuleiro.printTabuleiro();
            int opcao = 0;

            if (jogo.controle.isJogadorDaVez()) {
                showMenu(jogo);
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1: {
                        int numPedra;
                        System.out.println("\nEscolha uma peça da sua mão para jogar: ");
                        jogo.jogador.printPedrasComIndices();
                        numPedra = scanner.nextInt();
                        jogo.jogador.escolherPedra(numPedra);
                        jogo.jogar(jogo.jogador.getPedraAJogar(), "Esquerdo", i);
                        break;
                    }
                    case 2: {
                        int numPedra;
                        System.out.println("\nEscolha uma peça da sua mão para jogar: ");
                        jogo.jogador.printPedrasComIndices();
                        numPedra = scanner.nextInt();
                        jogo.jogador.escolherPedra(numPedra);
                        jogo.jogar(jogo.jogador.getPedraAJogar(), "Direito", i);
                        break;
                    }
                    case 3: {

                        break;
                    }
                    case 4: {
                       
                        break;
                    }
                    case 5: {
                        jogo.controle.alternarJogadorDaVez();
                        break;
                    }
                    case 6: {
                        jogo.controle.setPartidaEmAndamento(false);
                        break;
                    }
                    default:
                        System.out.println("Opção inválida!");
                }
            } else {
                jogo.jogadorIA.jogar(jogo.tabuleiro);
                jogo.controle.alternarJogadorDaVez();
            }
            i++;
        }
        scanner.close();
    }

    public static void showMenu(Jogo jogo) {
        System.out.println("Pedras do jogador: ");
        jogo.jogador.printPedras();
        System.out.println("\nEscolha uma opção: ");
        System.out.println("1 - Jogar no lado esquerdo");
        System.out.println("2 - Jogar lado direito");
        System.out.println("3 - Girar pedra");
        System.out.println("4 - Comprar");
        System.out.println("5 - Passar a vez");
        System.out.println("6 - Desistir");
    }

    public static void showJogadorInicial(Object jogadorInicial) {
        if (jogadorInicial instanceof Jogador) {
            Jogador jogador = (Jogador) jogadorInicial;
            System.out.println("Jogador inicial: " + jogador.getNome() + "\n");
        } else if (jogadorInicial instanceof JogadorIA) {
            JogadorIA jogadorIA = (JogadorIA) jogadorInicial;
            System.out.println("Jogador inicial: " + jogadorIA.getNome() + "\n");
        }
    }
}
