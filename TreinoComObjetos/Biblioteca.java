package TreinoComObjetos;

import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Livros> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livros livro) {
        livros.add(livro);
        System.out.println("O livro " + livro.getTitulo() + " foi adicionado à biblioteca.");
    }

    public void emprestarLivro(String titulo) {
        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.emprestar();
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void devolverLivro(String titulo) {
        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void listarLivros() {
        System.out.println("Livros disponíveis: ");
        for (Livros livro : livros) {
            if (livro.estaDisponivel()) {
                System.out.println(livro.getTitulo());
            }
        }
    }
}
