public class Controle {
    private boolean jogadorDaVez; // true se jogador humano está com a vez, false se jogador IA está com a vez
    private JogadorIA jogadorIA;
    private Jogador jogador;
    private boolean partidaEmAndamento;

    public Controle(Jogador jogador, JogadorIA jogadorIA) {
        this.jogadorIA = jogadorIA;
        this.jogador = jogador;
    }

    // Método para determinar qual jogador deve começar o jogo
    public Object jogadorInicial() {
        int maiorDuplo = -1;
        Object jogadorInicial = null; // Pode ser Jogador ou JogadorIA

        // Verifica as pedras do jogador humano para encontrar o maior duplo
        for (Pedra pedra : jogador.getPedras()) {
            if (pedra.getNumDireito() == pedra.getNumEsquerdo()) {
                int valorDuplo = pedra.getNumDireito();
                if (valorDuplo > maiorDuplo) {
                    maiorDuplo = valorDuplo;
                    jogadorInicial = jogador;
                }
            }
        }

        // Verifica as pedras do jogador IA para encontrar o maior duplo
        for (Pedra pedra : jogadorIA.getPedras()) {
            if (pedra.getNumDireito() == pedra.getNumEsquerdo()) {
                int valorDuplo = pedra.getNumDireito();
                if (valorDuplo > maiorDuplo) {
                    maiorDuplo = valorDuplo;
                    jogadorInicial = jogadorIA;
                }
            }
        }

        // Definir quem é o jogador inicial com base no maior duplo encontrado
        if (jogadorInicial == jogador) {
            jogadorDaVez = true; // Jogador humano começa jogando
        } else if (jogadorInicial == jogadorIA) {
            jogadorDaVez = false; // Jogador IA começa jogando
        }

        //printJogadorDaVez();

        return jogadorInicial; // Retorna o jogador inicial (pode ser Jogador ou JogadorIA)
    }

    public void jogar() {
    
    }

    public void printJogadorDaVez() {
        if (isJogadorDaVez()) {
            System.out.println("\n===== Rodada do Jogador =====\n");
        } else {
            System.out.println("\n===== Rodada da IA =====\n");
        }
    }

    // Método para alternar a vez do jogador
    public void alternarJogadorDaVez() {
        jogadorDaVez = !jogadorDaVez;
    }

    // Getters e setters

    public boolean isJogadorDaVez() {
        return jogadorDaVez;
    }

    public JogadorIA getJogadorIA() {
        return jogadorIA;
    }

    public void setJogadorIA(JogadorIA jogadorIA) {
        this.jogadorIA = jogadorIA;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public boolean isPartidaEmAndamento() {
        return partidaEmAndamento;
    }

    public void setPartidaEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }

    public void setJogadorDaVez(boolean jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }
    
}
