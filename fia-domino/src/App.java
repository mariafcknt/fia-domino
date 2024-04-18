import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();

        // Exibindo as pedras
        System.out.println(" ");
        
        jogo.printPedrasJogadores();

        System.out.println(" ");
        jogo.printPedras();

    }

}
