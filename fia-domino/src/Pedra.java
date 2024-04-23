public class Pedra {
    private String nome;
    private int numDireito;
    private int numEsquerdo;

    public Pedra(String nome, int ladoEsquerdo, int ladoDireito) {
        this.nome = nome;
        this.numEsquerdo = ladoEsquerdo;
        this.numDireito = ladoDireito;
    }

    public void inverterLados() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumDireito() {
        return numDireito;
    }

    public void setNumDireito(int ladoDireito) {
        this.numDireito = ladoDireito;
    }

    public int getNumEsquerdo() {
        return numEsquerdo;
    }

    public void setNumEsquerdo(int ladoEsquerdo) {
        this.numEsquerdo = ladoEsquerdo;
    }

}
