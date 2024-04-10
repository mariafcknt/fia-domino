public class Pedra {
    private String nome;
    private int ladoDireito;
    private int ladoEsquerdo;

    public Pedra(String nome, int ladoDireito, int ladoEsquerdo) {
        this.nome = nome;
        this.ladoDireito = ladoDireito;
        this.ladoEsquerdo = ladoEsquerdo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLadoDireito() {
        return ladoDireito;
    }

    public void setLadoDireito(int ladoDireito) {
        this.ladoDireito = ladoDireito;
    }

    public int getLadoEsquerdo() {
        return ladoEsquerdo;
    }

    public void setLadoEsquerdo(int ladoEsquerdo) {
        this.ladoEsquerdo = ladoEsquerdo;
    }

    

}
