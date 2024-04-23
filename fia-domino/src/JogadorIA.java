import java.util.List;

public class JogadorIA {
    private String nome;
    private Jogador jogadorIA; // Composição: usar um objeto Jogador
    private boolean suaRodada;

    public JogadorIA() {
        jogadorIA = new Jogador(); // Cria uma instância de Jogador
        this.nome = "Jogador IA";
    }

    public void jogar(Tabuleiro tabuleiro) {
        List<Pedra> pedrasIA = jogadorIA.getPedras();
        Pedra pedraSelecionada = null;
        String lado = null;

        int ladoEsquerdo = tabuleiro.getLadoEsquerdoTabuleiro();
        int ladoDireito = tabuleiro.getLadoDireitoTabuleiro();

        for (Pedra pedra : pedrasIA) {
            if (ladoEsquerdo == -1 || pedra.getNumDireito() == ladoEsquerdo) {
                pedraSelecionada = pedra;
                lado = "Esquerdo";
                break;
            }
        }

        if (pedraSelecionada == null) {
            for (Pedra pedra : pedrasIA) {
                if (ladoDireito == -1 || pedra.getNumEsquerdo() == ladoDireito) {
                    pedraSelecionada = pedra;
                    lado = "Direito";
                    break;
                }
            }
        }

        if (pedraSelecionada != null) {
            boolean sucesso;
            if (lado.equals("Esquerdo")) {
                sucesso = tabuleiro.adicionarPedraEsquerda(pedraSelecionada);
            } else {
                sucesso = tabuleiro.adicionarPedraDireita(pedraSelecionada);
            }

            // Se jogou com sucesso, remova a peça da mão do jogador IA
            if (sucesso) {
                jogadorIA.getPedras().remove(pedraSelecionada);
                System.out.println("Jogador IA jogou a peça " + pedraSelecionada.getNome() + " no lado " + lado + ".");
            }
        } else {
            System.out.println("Jogador IA não conseguiu jogar nenhuma pedra.");
        }
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
