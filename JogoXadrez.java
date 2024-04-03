public class JogoXadrez {
    public static void main(String[] args) {
        TabuleiroXadrez tabuleiro = new TabuleiroXadrez();

        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.REI, Cor.BRANCO, new Posicao(0, 4)), new Posicao(0, 4));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.REI, Cor.PRETO, new Posicao(7, 4)), new Posicao(7, 4));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.RAINHA, Cor.BRANCO, new Posicao(0, 3)), new Posicao(0, 3));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.RAINHA, Cor.PRETO, new Posicao(7, 3)), new Posicao(7, 3));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.TORRE, Cor.BRANCO, new Posicao(0, 0)), new Posicao(0, 0));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.TORRE, Cor.BRANCO, new Posicao(0, 7)), new Posicao(0, 7));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.TORRE, Cor.PRETO, new Posicao(7, 0)), new Posicao(7, 0));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.TORRE, Cor.PRETO, new Posicao(7, 7)), new Posicao(7, 7));

        exibirTabuleiro(tabuleiro);

        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.CAVALO, Cor.BRANCO, new Posicao(0, 1)), new Posicao(0, 1));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.CAVALO, Cor.PRETO, new Posicao(7, 6)), new Posicao(7, 6));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.BISPO, Cor.BRANCO, new Posicao(0, 2)), new Posicao(0, 2));
        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.BISPO, Cor.PRETO, new Posicao(7, 5)), new Posicao(7, 5));

        tabuleiro.adicionarPeca(new PecaXadrez(TipoPeca.CAVALO, Cor.BRANCO, new Posicao(2, 2)), new Posicao(2, 2));

        exibirTabuleiro(tabuleiro);
    }

    public static void exibirTabuleiro(TabuleiroXadrez tabuleiro) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                PecaXadrez peca = tabuleiro.getPeca(new Posicao(i, j));
                if (peca != null) {
                    System.out.print(peca.getTipo() + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
