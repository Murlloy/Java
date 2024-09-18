package ListaEx2;

import java.util.Scanner;

public class ExC_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double n1,n2,n3,n4,ex,media;

        System.out.print("Digite a nota do Primeiro Bimestre: ");
        n1 = ler.nextDouble();

        System.out.print("Digite a nota do Segundo Bimestre: ");
        n2 = ler.nextDouble();

        System.out.print("Digite a nota do Terceiro Bimestre: ");
        n3 = ler.nextDouble();

        System.out.print("Digite a nota do Quarto Bimestre: ");
        n4 = ler.nextDouble();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.printf("Sua media: %.2f", media);

        if(media>= 7){
            System.out.println("\nParabens! Você passou de Primeira!");
        }else{
            System.out.println("\nInfelizmente você tera que fazer Recuperação :(");

            System.out.print("Digite a nota da recuperação: ");
            ex = ler.nextDouble();

            media = (media + ex) / 2;

            System.out.printf("Sua nova media: %.2f", media);

            if(media >= 5)
                System.out.println("\nPassou de Ano, porem precisou de Recuperação");
            else
                System.out.println("\nReprovado!");
        }

        ler.close();
    }
}
