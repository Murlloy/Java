package TreinoComObjetos;

import java.util.Scanner;

public class TestarBiblioteca {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        int esc;


        biblioteca.adicionarLivro(new Livros("O Primeiro Codigo em Java!", "Carlos Fabbri Jr", 1820));
        biblioteca.adicionarLivro(new Livros("O Pequeno Codigo em Java", "Carlos Fabbri Jr", 1920));
        biblioteca.adicionarLivro(new Livros("1999: a revolução do Java", "Carlos Fabbri Jr", 1999));

        while (true) {
            System.out.println("\nBem-vindo à biblioteca!");
            System.out.println("[1] - Pegar emprestado");
            System.out.println("[2] - Devolver livro");
            System.out.println("[3] - Ver lista de livros");
            System.out.println("[4] - Sair");

            esc = ler.nextInt();
            ler.nextLine(); 
            
            if (esc == 1) {
                System.out.print("Digite o título do livro que deseja pegar emprestado: ");
                String titulo = ler.nextLine();
                biblioteca.emprestarLivro(titulo);

            } else if (esc == 2) {
                System.out.print("Digite o título do livro que deseja devolver: ");
                String titulo = ler.nextLine();
                biblioteca.devolverLivro(titulo);

            } else if (esc == 3) {
                biblioteca.listarLivros();

            } else if (esc == 4) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Valor inválido!");
            }
        }

        ler.close();
    }
}
