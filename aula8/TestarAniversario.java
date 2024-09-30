package aula8;

import java.util.Scanner;

public class TestarAniversario {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        Aniversario niver = new Aniversario();

        System.out.print("Digite um dia: ");
        int dia = ler.nextInt();

        System.out.print("Digite um mes: ");
        int mes = ler.nextInt();

        niver.verificarAniversario(dia, mes);
    }
}
