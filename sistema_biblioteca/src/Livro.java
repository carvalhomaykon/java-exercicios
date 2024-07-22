// Inclementar a classe Livro
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }
    public void devolverLivro(){
        if (!disponivel){
            disponivel = true;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        }
        else{
            System.out.print("O livro '" + titulo + "' já está disponível.");
        }
    }
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + titulo + "' não está disponível para empréstimo.");
        }
    }

    @Override
    public String toString(){
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao + ", Disponível: " + (disponivel ? "Sim" : "Não");
    }
}
