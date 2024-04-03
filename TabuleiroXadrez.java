public class TabuleiroXadrez {
    private PecaXadrez[][] tabuleiro;

    public TabuleiroXadrez() {
        tabuleiro = new PecaXadrez[8][8];
    }

    public void adicionarPeca(PecaXadrez peca, Posicao posicao) {
        tabuleiro[posicao.getLinha()][posicao.getColuna()] = peca;
    }

    public PecaXadrez getPeca(Posicao posicao) {
        if (posicao.getLinha() >= 0 && posicao.getLinha() < 8 &&
            posicao.getColuna() >= 0 && posicao.getColuna() < 8) {
            return tabuleiro[posicao.getLinha()][posicao.getColuna()];
        } else {
            return null;
        }
    }
    
}
