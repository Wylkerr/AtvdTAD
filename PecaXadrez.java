public class PecaXadrez {
    private TipoPeca tipo;
    private Cor cor;
    private Posicao posicao;

    public PecaXadrez(TipoPeca tipo, Cor cor, Posicao posicao) {
        this.tipo = tipo;
        this.cor = cor;
        this.posicao = posicao;
    }

    public void mover(Posicao novaPosicao) {
        
        this.posicao = novaPosicao;
    }

    public void capturar() {
        
    }

    public boolean verificarMovimento(Posicao novaPosicao) {
        
        return true; 
    }

    public TipoPeca getTipo() {
        return tipo;
    }

    public Cor getCor() {
        return cor;
    }

    public Posicao getPosicao() {
        return posicao;
    }
}
