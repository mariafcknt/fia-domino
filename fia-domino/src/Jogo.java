import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays; // Adicione esta importação

public class Jogo {
    private List<Pedra> pedras = new ArrayList<>();
    Jogador jogador = new Jogador();

    public void iniciarJogo() {
        Pedra[] todasPedras = new Pedra[28];
        
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
        for (Pedra pedra : pedras) {
            System.out.println(pedra.getNome());
        }
    }

    public void distribuirPedras() {
        for (int i = 0; i < 7; i++) {
            jogador.receberPedras(pedras[i]);
        }
    }
}
