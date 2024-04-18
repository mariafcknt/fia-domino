import java.util.List;

public class JogadorIA {
    private Jogador jogadorBase; // Composição: usar um objeto Jogador

    public JogadorIA() {
        jogadorBase = new Jogador(); // Cria uma instância de Jogador
    }

    // Chamar métodos de Jogador
    public void receberPedra(Pedra pedra) {
        jogadorBase.receberPedra(pedra);
    }

    public List<Pedra> getPedras() {
        return jogadorBase.getPedras();
    }

    public void printPedras() {
        jogadorBase.printPedras();
    }

    // Outros métodos exclusivos de JogadorIA
    // Adicione aqui os métodos exclusivos da IA
}
