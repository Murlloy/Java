package aula8;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha um numero para saber a tabuada: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.print( " " + i + " X " + j + ": " + j * i  + "\n");
            }
        }
        ler.close();
    }
}
