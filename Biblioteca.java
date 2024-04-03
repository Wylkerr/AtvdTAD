import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.emprestarCopia();
                return;
            }
        }
        System.out.println("Livro não encontrado na biblioteca.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.devolverCopia();
                return;
            }
        }
        System.out.println("Livro não encontrado na biblioteca.");
    }

    public boolean verificarDisponibilidade(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro.verificarDisponibilidade();
            }
        }
        System.out.println("Livro não encontrado na biblioteca.");
        return false;
    }

    public void exibirInformacoesLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.exibirInformacoes();
                return;
            }
        }
        System.out.println("Livro não encontrado na biblioteca.");
    }
}
