import java.util.Scanner;

public class MaiorMenor {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double n1,n2,n3,temp;

        System.out.print("Digite um Valor: ");
        n1 = ler.nextDouble();

        System.out.print("Digite um Valor: ");
        n2 = ler.nextDouble();

        System.out.print("Digite um Valor: ");
        n3 = ler.nextDouble();

        if(n1 > n2){
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if(n1 > n3){
            temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if(n2 > n3){
            temp = n2;
            n2 = n3;
            n3 = temp;
        }

        System.out.println(" " + n1 + " " + n2 +" " + n3 + " ");
    }
}
