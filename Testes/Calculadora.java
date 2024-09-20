

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double n1, resultado = 0;

        System.out.println("Digite a Formula: ");
        String formula = ler.nextLine();
        int fim = formula.length();

        

        if(formula.indexOf("+", 1) != -1){
            System.out.println("Conta de soma");

            n1 = Double.parseDouble(formula.substring(0, formula.indexOf("+")));
            formula = formula.substring(formula.indexOf("+"), fim);
            fim = formula.length();
            System.out.println(formula);
            resultado += n1;


        }else if(formula.indexOf("-", 1) != -1){
            System.out.println("Conta de Subtração");


        }
    }
}
