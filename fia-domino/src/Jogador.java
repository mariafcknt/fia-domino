import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Jogador {
    private String nome;
    // private Pedra[] pedras;
    private List<Pedra> pedras;

    public Jogador() {
        this.pedras = new ArrayList<>();
    }

    public void receberPedra(Pedra pedra) {
        pedras.add(pedra);
    }

    //printar as pedras do jogador
    public List<Pedra> printPedras() {
        return pedras;
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
