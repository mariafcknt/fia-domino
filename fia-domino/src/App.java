import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();

        // Exibindo as pedras
        System.out.println(" ");
        System.out.println("Pedras do player:");
        // Chame o método para obter a lista de pedras do jogador
        List<Pedra> pedrasDoJogador = jogo.getJogador().getPedras();
        for (Pedra pedra : pedrasDoJogador) {
            System.out.println(pedra.getNome());
        }

        System.out.println(" ");
        System.out.println("Pedras da IA:");
        // Chame o método para obter a lista de pedras do jogadorIA
        List<Pedra> pedrasDoJogadorIA = jogo.getJogadorIA().getPedras();
        for (Pedra pedra : pedrasDoJogadorIA) {
            System.out.println(pedra.getNome());
        }

        System.out.println(" ");
        jogo.printPedras();

    }

}
