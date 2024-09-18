import java.util.Scanner;

public class Juros {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double capital,taxa,juros,montante,tempo;
        int esc;

        do{
            do{
                System.out.println("Qual o juros que deseja calcular? ");
                System.out.println("[1] - Simples"+"\n[2] - Compostos" + "\n[3] - Sair");
                esc = ler.nextInt();
                if(esc > 3 || esc < 1)
                    System.out.println("Valor Invalido!!");
            }while(esc < 1 || esc > 3);

            if(esc == 1){

                System.out.println("Qual o Capital inicial?");
                capital = ler.nextDouble();

                System.out.println("Por quanto tempo Deseja Aplicar? (meses)");
                tempo = ler.nextDouble();

                System.out.println("Qual a taxa mensal?");
                taxa = ler.nextDouble();

                juros = capital * (taxa / 100) * tempo;
                montante = capital + juros;

                System.out.println("O valor final é R$" + montante);


            }else if(esc == 2){

                System.out.println("Qual o Capital inicial?");
                capital = ler.nextDouble();

                System.out.println("Por quanto tempo Deseja Aplicar? (meses)");
                tempo = ler.nextDouble();

                System.out.println("Qual a taxa mensal?");
                taxa = ler.nextDouble();

                montante = capital * Math.pow((1 + (taxa /100)),tempo);

                System.out.println("O valor final é R$" + montante);

            }else if(esc == 3){
                System.out.println("Saindo...");
            }
            if(esc != 3){
                System.out.println("Deseja continuar a Calcular?");
                System.out.println("[1] - Sim [2] - Não");
                esc = ler.nextInt();
            }

        }while(esc == 1);

        ler.close();

    }
}
