import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Jogador {
    private String nome;
    private boolean suaRodada;

    // private Pedra[] pedras;
    private List<Pedra> pedras;

    public Jogador() {
        this.pedras = new ArrayList<>();
        this.nome = "Jogador";
    }

    public void receberPedra(Pedra pedra) {
        pedras.add(pedra);
    }

    public void removerPedra(Pedra pedra){
        pedras.remove(pedra);
    }

    //printar as pedras do jogador
    public void printPedras() {
        for (Pedra pedra : pedras) {
            System.out.println(pedra.getNome());
        }
    }

    public void printPedrasComIndices() {
        // Itera pelas pedras do jogador e imprime cada pedra com seu índice
        for (int i = 0; i < pedras.size(); i++) {
            // Mostra o índice da pedra seguido pelo nome da pedra
            System.out.println(i + ": " + pedras.get(i).getNome());
        }
    }
    

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedra> getPedras() {
        return pedras;
    }

    public void setPedras(List<Pedra> pedras) {
        this.pedras = pedras;
    }
}
