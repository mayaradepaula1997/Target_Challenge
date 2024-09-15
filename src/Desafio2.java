
import java.util.Scanner;

public class Desafio2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci e exibe a mensagem
        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }


        scanner.close();
    }

    // Função para verificar se um número pertence à sequência de Fibonacci
    private static boolean isFibonacci(int number) {
        if (number < 0) return false;

        // Inicia os dois primeiros números da sequência de Fibonacci
        int a = 0, b = 1;

        // Calcula a sequência de Fibonacci até encontrar o número ou passar dele
        while (b < number) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        // Se b igual ao número, ele pertence à sequência
        return b == number;
    }
}


