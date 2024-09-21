package TreinoComObjetos;

public class Livros {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public String getTitulo(){ return this.titulo; }
    public String getAutor(){ return this.autor; }
    public int getAno(){ return this.anoPublicacao; }
    public boolean getDisponivel(){ return this.disponivel; }

    public void setTitulo(String titulo){ this.titulo = titulo; }
    public void setAutor(String autor){ this.autor = autor; }
    public void setAno(int ano){ this.anoPublicacao = ano; }
    public void setDisponivel(boolean disponivel){ this.disponivel = disponivel; }

    public Livros(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; 
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Este livro não está disponível!");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Devolvido com sucesso!");
        } else {
            System.out.println("Não tem como devolver algo que você nem pegou emprestado!");
        }
    }

    public boolean estaDisponivel() {
        if (!disponivel) {
            System.out.println("Desculpe, livro indisponível");
            return false;
        } else {
            System.out.println("Livro disponível");
            return true;
        }
    }
}
