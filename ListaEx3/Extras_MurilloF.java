package ListaEx3;

import java.util.Scanner;

public class Extras_MurilloF {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        System.out.println("--- Exercicio A ---");

        for(int i = 0; i <= 15; i++){
            System.out.print(i + ": ");
            System.out.println(Math.pow(3, i) + " ");
        }

        System.out.println("--- Exercicio B ---");

        int atual = 1,anterior = 0,proximo;
        System.out.println(anterior);

        proximo = atual + anterior;

        for(int i = 0; i <= 15; i++){
            anterior = atual;
            atual = proximo;

            proximo = atual + anterior;

            System.out.println(anterior);
        }

        System.out.println("--- Exercicio C ---");

        int pares = 0, impares = 0;

        for(int i = 1; i <= 20; i++){
            System.out.print("Digite um numero: ");
            int n = ler.nextInt();

            if(n % 2 == 0)
                pares += 1;
            else
                impares += 1;
        }

        System.out.printf("Há %d Pares e %d impares", pares, impares);

    }
}
