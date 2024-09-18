package ListaEx2;

public class ChatGpt {

        public static int calcular(String expressao) {
            int resultado = 0;
            int numeroAtual = 0;
            char operadorAtual = '+'; // Operador inicial
    
            int i = 0;
            while (i < expressao.length()) {
                char ch = expressao.charAt(i);
    
                // Construir o número
                if (ch >= '0' && ch <= '9') {
                    numeroAtual = numeroAtual * 10 + (ch - '0');
                }
    
                // Se encontramos um operador ou chegamos ao fim da string
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || i == expressao.length() - 1) {
    
                    // Realizar a operação com base no operador atual
                    if (operadorAtual == '+') {
                        resultado += numeroAtual;
                    } else if (operadorAtual == '-') {
                        resultado -= numeroAtual;
                    } else if (operadorAtual == '*') {
                        resultado *= numeroAtual;
                    } else if (operadorAtual == '/') {
                        if (numeroAtual == 0) {
                            System.out.println("Erro: Divisão por zero!");
                            return 0;
                        }
                        resultado /= numeroAtual;
                    }
    
                    // Atualizar o operador atual
                    operadorAtual = ch;
                    // Resetar o número atual para o próximo número
                    numeroAtual = 0;
                }
    
                i++;
            }
    
            return resultado;
        }
    
        public static void main(String[] args) {
            String expressao = "10+25+69-78/2";
            int resultado = calcular(expressao);
            System.out.println("Resultado: " + resultado);
        }
    }
    
}
