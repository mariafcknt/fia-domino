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
        for (int i = 0; i < 14; i++) {
            if (i % 2 == 0) {
                jogador.receberPedra(pedras.get(0));
                pedras.remove(0);
            } else {
                jogadorIA.receberPedra(pedras.get(0));
                pedras.remove(0);
            }
        }
    //}

        /*for (int j = 0; j < 7; j++) {
            jogadorIA.receberPedra(pedras.get(j));
            pedras.remove(j);
        }

        /*System.out.println(" ");
        System.out.println("Pedras depois da distribuição: ");
        printPedras();*/
    }

    //printar as pedras
    public void printPedras() {
        for (Pedra pedra : pedras) {
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
