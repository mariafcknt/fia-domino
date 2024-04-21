public class Controle {
    private Jogador jogadorDaVez;
    private Jogador jogadorIA;
    private Jogador jogador;


    public Controle(Jogador jogadorIA, JogadorIA jogadorIA2) {
        this.jogadorIA = jogadorIA;
        this.jogador = jogadorIA2;
    }

    /*public Jogador jogadorInicial(){
        int maiorDuplo = -1;
        Jogador jogadorInicial = null;

        for (Pedra pedra : jogador.getPedras()) {
            if (pedra.getNumDireito() == pedra.getNumEsquerdo()) {
                int valorDuplo = pedra.getNumDireito();
                if (valorDuplo > maiorDuplo) {
                    maiorDuplo = valorDuplo;
                    jogadorInicial =  jogador;
                }
            }
        }

        for (Pedra pedra : jogadorIA.getPedras()) {
            if (pedra.getNumDireito() == pedra.getNumEsquerdo()) {
                int valorDuplo = pedra.getNumDireito();
                if (valorDuplo > maiorDuplo) {
                    maiorDuplo = valorDuplo;
                    jogadorInicial = jogadorIA;
                }
            }
        }
    }*/
}
