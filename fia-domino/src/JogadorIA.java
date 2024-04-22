import java.util.List;

public class JogadorIA {
    private String nome;
    private Jogador jogadorIA; // Composição: usar um objeto Jogador
    private boolean suaRodada;

    public JogadorIA() {
        jogadorIA = new Jogador(); // Cria uma instância de Jogador
        this.nome = "Jogador IA";
    }

    // Chamar métodos de Jogador
    public void receberPedra(Pedra pedra) {
        jogadorIA.receberPedra(pedra);
    }

    public List<Pedra> getPedras() {
        return jogadorIA.getPedras();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador getJogadorIA() {
        return jogadorIA;
    }

    public void setJogadorIA(Jogador jogadorIA) {
        this.jogadorIA = jogadorIA;
    }

    public boolean isSuaRodada() {
        return suaRodada;
    }

    public void setSuaRodada(boolean suaRodada) {
        this.suaRodada = suaRodada;
    }

    
}
