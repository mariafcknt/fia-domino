import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Jogo jogo = new Jogo();

        jogo.iniciarJogo();

        // System.out.println(jogo.getJogador().getPedras());

        // Exibindo as pedras
        System.out.println(" ");
        System.out.println("Pedras do player:");
        List<Pedra> pedrasDoJogador = jogo.getJogadorIA().printPedras();
        for (Pedra pedra : pedrasDoJogador) {
            System.out.println(pedra.getNome());
        }
        System.out.println(" ");
        System.out.println("Pedras da IA:");
        List<Pedra> pedrasDoJogadorIA = jogo.getJogadorIA().printPedras();
        for (Pedra pedra : pedrasDoJogadorIA) {
            System.out.println(pedra.getNome());
        }

        // System.out.println(pedras[27].getNome());
    }

}
