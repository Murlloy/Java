import java.util.Scanner;

public class ImparOuPar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero: ");
        num = ler.nextInt();

        if(num >= 0 && (num % 2) == 0){
            System.out.println("Numero positivo e Par");
        }else if(num >= 0 && ((num % 2) != 0))
        System.out.println("Numero positivo e impar");
        else if(num < 0 && (num %2) != 0)
        System.out.println("Numero Negativo e Impar");
        else
        System.out.println("Numero Negativo e Par");

        ler.close();
    }

}
