import java.util.List;

public class JogadorIA {
    private Jogador jogadorIA; // Composição: usar um objeto Jogador

    public JogadorIA() {
        jogadorIA = new Jogador(); // Cria uma instância de Jogador
    }

    // Chamar métodos de Jogador
    public void receberPedra(Pedra pedra) {
        jogadorIA.receberPedra(pedra);
    }

    public List<Pedra> getPedras() {
        return jogadorIA.getPedras();
    }

    public void printPedras() {
        jogadorIA.printPedras();
    }


}
