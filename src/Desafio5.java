import java.util.Scanner;

public class Desafio5 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();


        scanner.close();


        System.out.println("String invertida: " + inverterString(input));
    }

    // Função para inverter os caracteres de uma string
    private static String inverterString(String str) {

        // Converte a string para um array de caracteres
        char[] caracteres = str.toCharArray();
        String resultado = "";

        // Adiciona os caracteres do array na ordem inversa
        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado += caracteres[i];
        }

        return resultado;
    }
}

