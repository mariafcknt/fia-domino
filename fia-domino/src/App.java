import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();
        jogo.iniciar();

        // jogo.printPedrasJogadores();

        System.out.println(" ");

        // Obter o jogador inicial
        Object jogadorInicial = jogo.controle.jogadorInicial();
        showJogadorInicial(jogadorInicial);

        while (jogo.controle.isPartidaEmAndamento()) {
            jogo.tabuleiro.printTabuleiro();
            jogo.controle.printJogadorDaVez();
            System.out.println("");
            int opcao = 0;

            if (jogo.controle.isJogadorDaVez()) {
                showMenu(jogo);
                opcao = scanner.nextInt();
                System.out.println(" ");
                
                switch (opcao) {
                    case 1: {
                        int numPedra;
                        System.out.println("Escolha uma peça da sua mão para jogar: ");
                        jogo.jogador.printPedrasComIndices();
                        numPedra = scanner.nextInt();
                        jogo.jogador.escolherPedra(numPedra);
                        jogo.jogar(jogo.jogador.getPedraAJogar(), "Esquerdo");
                        System.out.println("\n Tabuleiro: ");
                        jogo.tabuleiro.printTabuleiro();
                        //jogo.jogador.printPedras();
                        // jogo.printPedrasJogadores();

                        // jogo.tabuleiro.adicionarPedraEsquerda()
                        break;
                    }
                    case 2: {

                        break;
                    }
                    case 3: {

                        break;
                    }
                    case 4: {
                        // jogo.controle.setJogadorDaVez(false);
                        jogo.controle.alternarJogadorDaVez();
                        break;
                    }
                    case 5: {
                        jogo.controle.setPartidaEmAndamento(false);
                        break;
                    }
                    default:
                        System.out.println("Opção inválida!");
                }
            } else {

                jogo.controle.alternarJogadorDaVez();
            }
        }
        scanner.close();
    }

    public static void showMenu(Jogo jogo) {
        System.out.println("Pedras do jogador: ");
        jogo.jogador.printPedras();
        System.out.println("\nEscolha uma opção: ");
        System.out.println("1 - <= Jogar no lado esquerdo");
        System.out.println("2 - Jogar lado direito =>");
        System.out.println("3 - Comprar");
        System.out.println("4 - Passar a vez");
        System.out.println("5 - Desistir");
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
