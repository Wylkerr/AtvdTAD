public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Harry Potter", "J.K. Rowling", 1997, 5);
        Livro livro2 = new Livro("The Lord of the Rings", "J.R.R. Tolkien", 1954, 3);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.emprestarLivro("Harry Potter");
        biblioteca.devolverLivro("Harry Potter");
        biblioteca.exibirInformacoesLivro("Harry Potter");
        System.out.println("Disponibilidade: " + biblioteca.verificarDisponibilidade("Harry Potter"));
    }
}
