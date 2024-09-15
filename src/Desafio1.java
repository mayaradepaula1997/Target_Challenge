
public class Desafio1 {


    public static void main(String[] args) {

        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        // Loop que executa enquanto K for menor que INDICE
        while (K < INDICE) {
            K = K + 1;  // Incrementa K
            SOMA = SOMA + K;  // Adiciona o valor de K a SOMA
        }

        System.out.println(SOMA);
    }
}

