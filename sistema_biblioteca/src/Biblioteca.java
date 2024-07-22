import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    // Uma lista dinâmica para armazenar objetos da classe Livro.

    public Biblioteca() {
        livros = new ArrayList<>();
        // Inicializa a lista de livros.
    }

    // Adiciona um livro à biblioteca
    public void adicionarLivros(Livro livro) {
        livros.add(livro); // Adiciona o livro à lista de livros
    }

    // Emprestar um livro baseado no título
    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.toString().contains(titulo)) {
                livro.emprestar();
                return;
            }
        }
        System.out.println("Livro com o título '" + titulo + "' não encontrado.");
    }

    // Devolve um livro baseado no título
    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.toString().contains(titulo)) {
                livro.devolverLivro();
                return;
            }
        }
        System.out.println("Livro com o título '" + titulo + "' não encontrado.");
    }

    // Mostra todos os livros disponíveis
    public void mostrarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.toString().contains("Sim")) {
                System.out.println(livro);
            }
        }
    }
}
