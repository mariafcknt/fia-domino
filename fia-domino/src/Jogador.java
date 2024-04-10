import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Jogador {
    private String nome;
    private Pedra[] pedras;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pedra[] getPedras() {
        return pedras;
    }
    public void setPedras(Pedra[] pedras) {
        this.pedras = pedras;
    }

    public void receberPedras(List<Pedra> pedra) {
        pedras.add(pedra);
    }

    
}
