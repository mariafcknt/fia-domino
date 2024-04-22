import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();
        jogo.iniciar();

        // Exibindo as pedras
        System.out.println(" ");

        jogo.printPedrasJogadores();

        System.out.println(" ");
        //jogo.printPedras();

        // Obter o jogador inicial
        Object jogadorInicial = jogo.controle.jogadorInicial();

        // Verificar o tipo do jogador inicial
        if (jogadorInicial instanceof Jogador) {
            Jogador jogador = (Jogador) jogadorInicial;
            System.out.println("Jogador inicial: " + jogador.getNome());
        } else if (jogadorInicial instanceof JogadorIA) {
            JogadorIA jogadorIA = (JogadorIA) jogadorInicial;
            System.out.println("Jogador inicial: " + jogadorIA.getNome());
        }

        jogo.tabuleiro.printTabuleiro();

        int opcao;
        do {
            showMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Escolha uma peça da sua mão para jogar: ");
                    
                    jogo.printPedrasJogadores();
                    
                    //jogo.tabuleiro.adicionarPedraEsquerda()
                    break;
                }
                case 2: {
                  
                    break;
                }
                case 3: {
                  
                    break;
                }
                case 4: {
                   
                    break;
                }
                case 5: {
                   // System.out.println(list.toString());
                    break;
                }
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("1 - <= Jogar no lado esquerdo");
        System.out.println("2 - Jogar lado direito =>");
        System.out.println("3 - Comprar");
        System.out.println("4 - Passar a vez");
        System.out.println("5 - Desistir");
    }

        // System.out.println(jogo.controle.printJogadorDaVez());

}
