import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays; 

public class Jogo {
    private List<Pedra> pedras = new ArrayList<>();
    Jogador jogador = new Jogador();
    JogadorIA jogadorIA = new JogadorIA();

    public void iniciarJogo() {
        Pedra[] todasPedras = new Pedra[28];
        
        //Criar as pedras
        int index = 0;
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                Pedra pedra = new Pedra("[" + i + "|" + j + "]", i, j);
                todasPedras[index] = pedra;
                index++;
            }
        }

        // Embaralhando as pedras
        List<Pedra> pedrasEmbaralhadas = Arrays.asList(todasPedras);
        Collections.shuffle(pedrasEmbaralhadas);

        // Adicionando as pedras à lista do jogo
        pedras.addAll(pedrasEmbaralhadas);

        // Exibindo as pedras
        //printPedras();

        //Distribuir as pedras embaralhadas aos jogadores
        distribuirPedras();
    }

    public void distribuirPedras() {
        int numPedras = pedras.size();
        for (int i = 0; i < 14; i++) {
            if (i % 2 == 0) {
                jogador.receberPedra(pedras.remove(0)); // Jogador recebe uma pedra
            } else {
                jogadorIA.receberPedra(pedras.remove(0)); // JogadorIA recebe uma pedra
            }
        }
    }

    //printar as pedras
    public void printPedras() {
        for (Pedra pedra : pedras) {
            System.out.println(pedra.getNome());
        }
    }

    public void printPedrasJogadores() {
        System.out.println("Pedras do player:");
        List<Pedra> pedrasDoJogador = getJogador().getPedras();
        for (Pedra pedra : pedrasDoJogador) {
            System.out.println(pedra.getNome());
        }

        System.out.println(" ");
        
        System.out.println("Pedras da IA:");
        List<Pedra> pedrasDoJogadorIA = getJogadorIA().getPedras();
        for (Pedra pedra : pedrasDoJogadorIA) {
            System.out.println(pedra.getNome());
        }
    }

    //Getters e setters
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public JogadorIA getJogadorIA() {
        return jogadorIA;
    }

    public void setJogadorIA(JogadorIA jogadorIA) {
        this.jogadorIA = jogadorIA;
    }

    
}
