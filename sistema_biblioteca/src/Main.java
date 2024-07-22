import javax.swing.plaf.synth.SynthTextAreaUI;
import javax.swing.text.html.ListView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criar uma instância da classe biblioteca
        Biblioteca biblioteca = new Biblioteca();
        // Cria um novo objeto da classe Biblioteca para gerenciar os livros.

        // Adicionar livros à biblioteca
        biblioteca.adicionarLivros(new Livro("1984", "George Orwell", 1949));
        biblioteca.adicionarLivros(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        // Cria novoos objetos 'livro' e os adiciona à biblioteca

        // Emprestar Livro
        System.out.println("\nEmprestar '1984': ");
        biblioteca.emprestarLivro("1984");

        // Mostrar livros disponíveis após empréstimo
        System.out.println("\nLivros disponíveis após emprestar '1984': ");
        biblioteca.mostrarLivrosDisponiveis();

        // Devolver livros
        System.out.println("\nDevolvendo '1984': ");
        biblioteca.devolverLivro("1984");

        // Mostrar livros disponíveis após a devolução
        System.out.println("\nLivros dispoíveis após devolver '1984': ");
        biblioteca.mostrarLivrosDisponiveis();
    }
}