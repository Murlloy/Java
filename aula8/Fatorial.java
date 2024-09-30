package aula8;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha um numero para fazer o fatorial");
        int n = ler.nextInt();

        int fat = n;

        for(int i = 1; i < n; i++){
            fat *= i;

        }

        System.out.println(fat);
    }
}
