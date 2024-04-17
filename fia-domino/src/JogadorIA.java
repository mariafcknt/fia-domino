import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class JogadorIA extends Jogador {
    private List<Pedra> pedrasIA;

    public JogadorIA() {
        this.pedrasIA = new ArrayList<>();
    }

    @Override
    public void receberPedra(Pedra pedra) {
    // Adicionar a pedra à lista de pedras do jogadorIA
    getPedrasIA().add(pedra);
    }

    public List<Pedra> getPedrasIA() {
        return pedrasIA;
    }

    public void setPedrasIA(List<Pedra> pedrasIA) {
        this.pedrasIA = pedrasIA;
    }
}
