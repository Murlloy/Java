import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int ano;

        System.out.print("Digite um ano: ");
        ano = ler.nextInt();

        ler.close();

        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("Ano bissexto!!");
        }else
            System.out.println("Infelizmente o Ano não é bissexto!");

    }
}