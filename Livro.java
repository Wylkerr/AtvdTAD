public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numCopiasDisponiveis;

    public Livro(String titulo, String autor, int anoPublicacao, int numCopiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numCopiasDisponiveis = numCopiasDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumCopiasDisponiveis() {
        return numCopiasDisponiveis;
    }

    public void emprestarCopia() {
        if (numCopiasDisponiveis > 0) {
            numCopiasDisponiveis--;
            System.out.println("Cópia emprestada com sucesso.");
        } else {
            System.out.println("Não há cópias disponíveis para empréstimo.");
        }
    }

    public void devolverCopia() {
        numCopiasDisponiveis++;
        System.out.println("Cópia devolvida com sucesso.");
    }

    public boolean verificarDisponibilidade() {
        return numCopiasDisponiveis > 0;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Número de cópias disponíveis: " + numCopiasDisponiveis);
    }
}
