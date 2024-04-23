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
        // Primeiro, tente adicionar a pedra normalmente
        if (ladoEsquerdoTabuleiro == -1 || pedra.getNumDireito() == ladoEsquerdoTabuleiro) {
            pedrasTabuleiro.add(0, pedra);
            ladoEsquerdoTabuleiro = pedra.getNumEsquerdo();
            return true;
        } else {
            // Se a pedra não puder ser adicionada, tente inverter os lados
            pedra.inverterLados(); // Método para inverter os lados da pedra
            
            // Tente adicionar a pedra invertida
            if (ladoEsquerdoTabuleiro == -1 || pedra.getNumDireito() == ladoEsquerdoTabuleiro) {
                pedrasTabuleiro.add(0, pedra);
                ladoEsquerdoTabuleiro = pedra.getNumEsquerdo();
                return true;
            }
            
            // Se ainda não for possível adicionar, reverta a inversão
            pedra.inverterLados();
        }
        return false;
    }
    
    public boolean adicionarPedraDireita(Pedra pedra) {
        // Primeiro, tente adicionar a pedra normalmente
        if (ladoDireitoTabuleiro == -1 || pedra.getNumEsquerdo() == ladoDireitoTabuleiro) {
            pedrasTabuleiro.add(pedra);
            ladoDireitoTabuleiro = pedra.getNumDireito();
            return true;
        } else {
            // Se a pedra não puder ser adicionada, tente inverter os lados
            pedra.inverterLados(); // Método para inverter os lados da pedra
            
            // Tente adicionar a pedra invertida
            if (ladoDireitoTabuleiro == -1 || pedra.getNumEsquerdo() == ladoDireitoTabuleiro) {
                pedrasTabuleiro.add(pedra);
                ladoDireitoTabuleiro = pedra.getNumDireito();
                return true;
            }
            
            // Se ainda não for possível adicionar, reverta a inversão
            pedra.inverterLados();
        }
        return false;
    }
    

    public boolean adicionarPrimeiraPedra(Pedra pedra) {
        if (pedra != null) {
            pedrasTabuleiro.add(pedra);
            ladoEsquerdoTabuleiro = pedra.getNumEsquerdo();
            ladoDireitoTabuleiro = pedra.getNumDireito();
            System.out.println("Lado direito da peça: " + pedra.getNumDireito());
            return true;
        }
        return false;
    }

    public void printTabuleiro() {
        System.out.println("---------------");
        System.out.print("Tabuleiro: ");
        for (int i = 0; i < pedrasTabuleiro.size(); i++) {
            Pedra pedra = pedrasTabuleiro.get(i);
            // Imprime a pedra com seu nome
            System.out.print(pedra.getNome());
            // Se não for a última pedra, imprime um espaço
            if (i < pedrasTabuleiro.size() - 1) {
                System.out.print(" ");
            }
        }
        // Após o loop, imprime uma nova linha
        System.out.println();
        System.out.println("Lado direito do tabuleiro: " + getLadoDireitoTabuleiro());
        System.out.println("Lado esquerdo do tabuleiro: " + getLadoEsquerdoTabuleiro());
        System.out.println("---------------\n");
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
