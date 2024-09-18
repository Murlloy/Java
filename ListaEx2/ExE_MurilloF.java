package ListaEx2;

import java.util.ArrayList;
import java.util.Scanner;

public class ExE_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<>();

        double n1, n2, n3, temp, max = 0,med = 0,min = 0;

        System.out.print("Digite um numero: ");
        n1 = ler.nextDouble();

        System.out.print("Digite um numero: ");
        n2 = ler.nextDouble();

        System.out.print("Digite um numero: ");
        n3 = ler.nextDouble();

        ler.close();

        numeros.add(n1);
        numeros.add(n2);
        numeros.add(n3);

        numeros.sort(null);

        System.out.println(numeros);
        

        /* if(n1 >= n3 && n1 >= n2){
            max = n1;

            if(n2 >= n3){
                med = n2;
                min = n3;
            }else{
                med = n3;
                min = n2;
            }

        }else if(n2 >= n3 && n2 >= n1){
            max = n2;

            if(n1 >= n3){
                med = n1;
                min = n3;
            }else{
                med = n3;
                min = n1;
            }

        }else if(n3 >= n2 && n3 >= n1){
            max = n3;

            if(n2 >= n1){
                med = n2;
                min = n1;
            }else{
                med = n1;
                min = n2;
            }
        }

        System.out.printf(" %.2f %.2f %.2f", min,med,max);*/
        

        

        //Codigo com variavel Auxiliar:

        /* 

        if(n1 > n2){
            temp = n1;   //Armazena o valor de n1 em uma variavel auxiliar
            n1 = n2;     // Troca o valor de n1 com n2
            n2 = temp;   // n2 pega o valor de n1 antes da troca 
        }
        if(n1> n3){
            temp = n1;
            n1 = n3;     //Mema coisa Aqui
            n3 = temp;
        }
        if(n2 > n3){
            temp = n2;
            n2 = n3;      //Aqui  tambem
            n3 = temp;
        }

        System.out.printf("A sequencia em ordem crescente é: %.2f %.2f %.2f", n1, n2, n3);

        /* 

        //Codigo com ArrayList:
        
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.print("Digite um numero: ");
        n1 = ler.nextInt();

        System.out.print("Digite um numero: ");
        n2 = ler.nextInt();

        System.out.print("Digite um numero: ");
        n3 = ler.nextInt();

        ler.close();

        numeros.add(n1);
        numeros.add(n2);
        numeros.add(n3);

        numeros.sort(null);

        System.out.println(numeros);
        */


    }
}
