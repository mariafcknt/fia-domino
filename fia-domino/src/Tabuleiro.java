import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private int ladoDireitoTabuleiro;
    private int ladoEsquerdoTabuleiro;
    private List<Pedra> pedrasTabuleiro = new ArrayList<>();

    public Tabuleiro() {
        this.ladoDireitoTabuleiro = -1;
        this.ladoEsquerdoTabuleiro = -1;
    }

    public boolean adicionarPedraEsquerda(Pedra pedra) {
        if (ladoEsquerdoTabuleiro == -1 || pedra.getNumDireito() == ladoEsquerdoTabuleiro) {
            pedrasTabuleiro.add(0, pedra);
            ladoEsquerdoTabuleiro = pedra.getNumEsquerdo();
            return true;
        }
        return false;
    }

    public boolean adicionarPedraDireita(Pedra pedra) {
        if (ladoDireitoTabuleiro == -1 || pedra.getNumEsquerdo() == ladoDireitoTabuleiro) {
            pedrasTabuleiro.add(0, pedra);
            ladoDireitoTabuleiro = pedra.getNumDireito();
            return true;
        }
        return false;
    }

    public void printTabuleiro() {
        for (Pedra pedra : pedrasTabuleiro) {
            System.out.println(pedra.getNome());
        }
    }

    // Getters e setters

    public int getLadoDireitoTabuleiro() {
        return ladoDireitoTabuleiro;
    }

    public void setLadoDireitoTabuleiro(int ladoDireito) {
        this.ladoDireitoTabuleiro = ladoDireito;
    }

    public int getLadoEsquerdoTabuleiro() {
        return ladoEsquerdoTabuleiro;
    }

    public void setLadoEsquerdoTabuleiro(int ladoEsquerdo) {
        this.ladoEsquerdoTabuleiro = ladoEsquerdo;
    }

    public List<Pedra> getPedrasTabuleiro() {
        return pedrasTabuleiro;
    }

    public void setPedrasTabuleiro(List<Pedra> pedrasTabuleiro) {
        this.pedrasTabuleiro = pedrasTabuleiro;
    }

}
