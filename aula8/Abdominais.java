package aula8;

import java.util.Scanner;

public class Abdominais {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int abdominais = 0;

        System.out.println("Vamos começar a fazer as 3 voltas!!!");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.println("Faça um abdominal!!");
                ler.nextLine();
            }
            abdominais += 5;

            if (i == 1)
                System.out.println("Primeira volta concluida!!");
            else if (i == 2)
                System.out.println("Segunda volta concluida!");
            else if (i == 3)
                System.out.println("Terceira volta concluida!");
            else
                System.out.println("Mais uma volta feita!!");
        }

        System.out.printf("Total de %d Abdominais", abdominais);

    }
}
